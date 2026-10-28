package com.example.HospitalManagementSystem.Repository;

import com.example.HospitalManagementSystem.Entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<doctor,Long> {
}
