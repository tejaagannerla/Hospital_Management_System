package com.example.HospitalManagementSystem.Service;

import com.example.HospitalManagementSystem.DTO.PatientMapper;
import com.example.HospitalManagementSystem.DTO.PatientRequest;
import com.example.HospitalManagementSystem.DTO.PatientResponse;
import com.example.HospitalManagementSystem.Entity.patient;
import com.example.HospitalManagementSystem.Exception.ResourceNotFound;
import com.example.HospitalManagementSystem.Repository.PatientRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class PatientService {
    public final PatientRepo pe;
    public final PatientMapper pm;
    public PatientResponse add( PatientRequest pnt) {
        if (pe.findByPatientcode(pnt.getPatientcode()).isPresent()) {
            log.warn("duplicate patient");
            throw new ResourceNotFound("patient already exits");
        }
        if (pe.findByEmail(pnt.getEmail()).isPresent()){
            log.warn("duplicate email");
            throw  new ResourceNotFound("email already exixts");
        }
        if (pe.findByPhonenumber(pnt.getPhonenumber()).isPresent()){
            log.warn("duplicate same number ");
            throw new ResourceNotFound("Phonenumber already exists");
        }
        if (pe.findByAadharnumber(pnt.getAadharnumber()).isPresent()){
            log.warn(" same aadhar number ");
            throw  new ResourceNotFound("Aadhar number already exits ");
        }
        patient p= pm.toEntity(pnt);
        patient savedpatient =pe.save(p);
        return pm.toResponse(savedpatient);
    }
    public List<PatientResponse>getall(){
        log.info("patient all details ");
        return pe.findAll().stream().map(pm::toResponse).toList();
    }
    public PatientResponse getid( Long id) {
        log.info("patients get by id ");
        patient p= pe.findById(id) .orElseThrow(() -> new ResourceNotFound("patient id not found"));
        return pm.toResponse(p);
    }
    public PatientResponse update(PatientRequest request,  Long id) {
        log.debug("patients all details updated ");
        patient p  = pe.findById(id).orElseThrow(() -> new ResourceNotFound("patient id not found"));
        pm.updatePatientFromRequest(request, p);
        patient updated=pe.save(p);
        return pm.toResponse(updated);

//        oldPatient.setPatient_code(pnt.getPatient_code());
//        oldPatient.setFrstname(pnt.getFrstname());
//        oldPatient.setLastname(pnt.getLastname());
//        oldPatient.setAge(pnt.getAge());
//        oldPatient.setGender(pnt.getGender());
//        oldPatient.setPhonenumber(pnt.getPhonenumber());
//        oldPatient.setEmail(pnt.getEmail());
//        oldPatient.setBlood_group(pnt.getBlood_group());
//        oldPatient.setAadharnumber(pnt.getAadharnumber());
//        oldPatient.setAddress(pnt.getAddress());
//        oldPatient.setEmergencyContact(pnt.getEmergencyContact());
//        oldPatient.setAdmitdate(pnt.getAdmitdate());
//        return pe.save(oldPatient);
    }
    public  void delete(Long id){
        log.info(" patients deleted ");
        patient p  = pe.findById(id).orElseThrow(() -> new ResourceNotFound("patient id not found"));
        pe.deleteById(id);
    }
}
