package com.example.HospitalManagementSystem.DTO;

//package com.Healthmanagement.HMS.DTO;

import com.example.HospitalManagementSystem.DTO.PatientRequest;
import com.example.HospitalManagementSystem.DTO.PatientResponse;
import com.example.HospitalManagementSystem.Entity.patient;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",builder=@Builder(disableBuilder = true))
public interface PatientMapper {
    patient toEntity(PatientRequest request);
    PatientResponse toResponse(patient patient);
    void updatePatientFromRequest(PatientRequest Re, @MappingTarget patient pt);
}
