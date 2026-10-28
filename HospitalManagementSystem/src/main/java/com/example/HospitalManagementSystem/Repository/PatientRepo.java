//package com.example.HospitalManagementSystem.Repository;
//
//import com.example.HospitalManagementSystem.Entity.patient;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface PatientRepo  extends JpaRepository<patient,Long> {
//Optional<patient> findByPatient_Code(Long pc);
//Optional<patient>findByEmail(String s);
//Optional<patient>findByPhoneNumber(Long p);
//Optional<patient>findByAadharNumber(String a);
//}
package com.example.HospitalManagementSystem.Repository;

import com.example.HospitalManagementSystem.Entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<patient, Long> {

    Optional<patient> findByPatientcode( String pc);

    Optional<patient> findByEmail(String s);

    Optional<patient> findByPhonenumber(String p);

    Optional<patient> findByAadharnumber(String a);
}
