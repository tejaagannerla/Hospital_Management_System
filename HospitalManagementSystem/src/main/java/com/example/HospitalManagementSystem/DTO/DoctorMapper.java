package com.example.HospitalManagementSystem.DTO;

//
import com.example.HospitalManagementSystem.Entity.doctor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
@Mapper(componentModel = "spring")
public interface DoctorMapper {
    doctor toEntity(DoctorRequest request);
    DoctorRequest toDTO(doctor doc);
    void updateDoctorFromRequest(
            DoctorRequest request,
            @MappingTarget doctor oldDoctor
    );
}
