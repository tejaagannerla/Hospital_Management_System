package com.example.HospitalManagementSystem.DTO;

import com.example.HospitalManagementSystem.Entity.patient;
import com.example.HospitalManagementSystem.Enum.Gender;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-09T13:26:30+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public patient toEntity(PatientRequest request) {
        if ( request == null ) {
            return null;
        }

        patient patient = new patient();

        patient.setPatientcode( request.getPatientcode() );
        patient.setAge( request.getAge() );
        if ( request.getGender() != null ) {
            patient.setGender( Enum.valueOf( Gender.class, request.getGender() ) );
        }
        patient.setAadharnumber( request.getAadharnumber() );
        patient.setPhonenumber( request.getPhonenumber() );
        patient.setFirstname( request.getFirstname() );
        patient.setLastname( request.getLastname() );
        patient.setAdmitdate( request.getAdmitdate() );
        patient.setEmergencyContact( request.getEmergencyContact() );
        patient.setAddress( request.getAddress() );
        patient.setBlood_group( request.getBlood_group() );
        patient.setEmail( request.getEmail() );

        return patient;
    }

    @Override
    public PatientResponse toResponse(patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientResponse patientResponse = new PatientResponse();

        patientResponse.setId( patient.getId() );
        patientResponse.setPatientcode( patient.getPatientcode() );
        patientResponse.setFirstname( patient.getFirstname() );
        patientResponse.setLastname( patient.getLastname() );
        patientResponse.setAge( String.valueOf( patient.getAge() ) );
        patientResponse.setGender( patient.getGender() );
        patientResponse.setPhonenumber( patient.getPhonenumber() );
        patientResponse.setEmail( patient.getEmail() );
        patientResponse.setAadharnumber( patient.getAadharnumber() );
        patientResponse.setAddress( patient.getAddress() );
        patientResponse.setEmergencyContact( patient.getEmergencyContact() );
        patientResponse.setAdmitdate( patient.getAdmitdate() );

        return patientResponse;
    }

    @Override
    public void updatePatientFromRequest(PatientRequest Re, patient pt) {
        if ( Re == null ) {
            return;
        }

        pt.setPatientcode( Re.getPatientcode() );
        pt.setAge( Re.getAge() );
        if ( Re.getGender() != null ) {
            pt.setGender( Enum.valueOf( Gender.class, Re.getGender() ) );
        }
        else {
            pt.setGender( null );
        }
        pt.setAadharnumber( Re.getAadharnumber() );
        pt.setPhonenumber( Re.getPhonenumber() );
        pt.setFirstname( Re.getFirstname() );
        pt.setLastname( Re.getLastname() );
        pt.setAdmitdate( Re.getAdmitdate() );
        pt.setEmergencyContact( Re.getEmergencyContact() );
        pt.setAddress( Re.getAddress() );
        pt.setBlood_group( Re.getBlood_group() );
        pt.setEmail( Re.getEmail() );
    }
}
