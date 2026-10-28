package com.example.HospitalManagementSystem.DTO;

import com.example.HospitalManagementSystem.Entity.doctor;
import com.example.HospitalManagementSystem.Enum.Gender;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T13:26:30+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public doctor toEntity(DoctorRequest request) {
        if ( request == null ) {
            return null;
        }

        doctor doctor = new doctor();

        doctor.setName( request.getName() );
        if ( request.getGender() != null ) {
            doctor.setGender( Enum.valueOf( Gender.class, request.getGender() ) );
        }
        doctor.setSpecialization( request.getSpecialization() );
        doctor.setEmail( request.getEmail() );
        doctor.setPhone( request.getPhone() );
        doctor.setAddress( request.getAddress() );
        doctor.setQualification( request.getQualification() );
        doctor.setExperience( request.getExperience() );
        doctor.setDepartment( request.getDepartment() );
        doctor.setLicenseNumber( request.getLicenseNumber() );
        if ( request.getConsultationFee() != null ) {
            doctor.setConsultationFee( String.valueOf( request.getConsultationFee() ) );
        }
        doctor.setAvailability( request.getAvailability() );

        return doctor;
    }

    @Override
    public DoctorRequest toDTO(doctor doc) {
        if ( doc == null ) {
            return null;
        }

        DoctorRequest doctorRequest = new DoctorRequest();

        doctorRequest.setName( doc.getName() );
        if ( doc.getGender() != null ) {
            doctorRequest.setGender( doc.getGender().name() );
        }
        doctorRequest.setSpecialization( doc.getSpecialization() );
        doctorRequest.setEmail( doc.getEmail() );
        doctorRequest.setPhone( doc.getPhone() );
        doctorRequest.setAddress( doc.getAddress() );
        doctorRequest.setQualification( doc.getQualification() );
        doctorRequest.setExperience( doc.getExperience() );
        doctorRequest.setDepartment( doc.getDepartment() );
        doctorRequest.setLicenseNumber( doc.getLicenseNumber() );
        if ( doc.getConsultationFee() != null ) {
            doctorRequest.setConsultationFee( Double.parseDouble( doc.getConsultationFee() ) );
        }
        doctorRequest.setAvailability( doc.getAvailability() );

        return doctorRequest;
    }

    @Override
    public void updateDoctorFromRequest(DoctorRequest request, doctor oldDoctor) {
        if ( request == null ) {
            return;
        }

        oldDoctor.setName( request.getName() );
        if ( request.getGender() != null ) {
            oldDoctor.setGender( Enum.valueOf( Gender.class, request.getGender() ) );
        }
        else {
            oldDoctor.setGender( null );
        }
        oldDoctor.setSpecialization( request.getSpecialization() );
        oldDoctor.setEmail( request.getEmail() );
        oldDoctor.setPhone( request.getPhone() );
        oldDoctor.setAddress( request.getAddress() );
        oldDoctor.setQualification( request.getQualification() );
        oldDoctor.setExperience( request.getExperience() );
        oldDoctor.setDepartment( request.getDepartment() );
        oldDoctor.setLicenseNumber( request.getLicenseNumber() );
        if ( request.getConsultationFee() != null ) {
            oldDoctor.setConsultationFee( String.valueOf( request.getConsultationFee() ) );
        }
        else {
            oldDoctor.setConsultationFee( null );
        }
        oldDoctor.setAvailability( request.getAvailability() );
    }
}
