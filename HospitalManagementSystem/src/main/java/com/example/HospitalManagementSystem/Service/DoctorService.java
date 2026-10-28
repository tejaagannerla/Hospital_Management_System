package com.example.HospitalManagementSystem.Service;



import com.example.HospitalManagementSystem.DTO.DoctorMapper;
import com.example.HospitalManagementSystem.DTO.DoctorRequest;
import com.example.HospitalManagementSystem.Entity.doctor;
import com.example.HospitalManagementSystem.Repository.DoctorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    public final DoctorRepo dr;
    public final DoctorMapper dm;

    public doctor add(doctor doc) {
        return dr.save(doc);
    }

    public List<doctor> getall() {
        return dr.findAll();
    }

    public doctor getid(Long id) {
        return dr.findById(id)
                .orElseThrow(() -> new RuntimeException("doctor id not found"));
    }

    public doctor update(DoctorRequest request, Long id) {

        doctor oldDoctor = dr.findById(id)
                .orElseThrow(() -> new RuntimeException("doctor id not found"));

        dm.updateDoctorFromRequest(request, oldDoctor);

        return dr.save(oldDoctor);
    }

    public void delete(Long id) {
        dr.deleteById(id);
    }
}