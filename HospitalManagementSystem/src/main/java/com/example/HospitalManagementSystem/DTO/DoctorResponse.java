package com.example.HospitalManagementSystem.DTO;

import com.example.HospitalManagementSystem.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorResponse {
    private Long id;
    private String name;
    private Gender gender;
    private String specialization;
    private String email;
    private String phone;
    private String address;
    private String qualification;
    private Integer experience;
    private String department;
    private String licenseNumber;
    private Double consultationFee;
    private String availability;
}