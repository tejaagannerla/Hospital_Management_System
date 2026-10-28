package com.example.HospitalManagementSystem.DTO;

import com.example.HospitalManagementSystem.Enum.BloodGroup;
import com.example.HospitalManagementSystem.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponse {
    private  Long id;
    private String patientcode;
    private String firstname;
    private String lastname;
    private String age;
    private Gender gender;
    private String phonenumber;
    private String email;
    private BloodGroup bloodgroup;
    private String aadharnumber;
    private String address;
    private String emergencyContact;
    private String admitdate;
    private String status;

}
