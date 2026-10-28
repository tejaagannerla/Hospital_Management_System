package com.example.HospitalManagementSystem.DTO;

import com.example.HospitalManagementSystem.Enum.BloodGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PatientRequest {
    @NotBlank(message = "required")
    private String patientcode;
    @NotBlank(message = " name is  required")
    private String firstname;
    @NotBlank(message = "required")
    private String lastname;
    @NotNull(message = "age is required")
    private  int age;
    @NotNull(message = "gender is required ")
    private  String gender;
    @Pattern(regexp = "[6_9]\\d{9}",message = "imvaloid number ")
    private String phonenumber;
    @Email(message = "invalid email format")
    private String email;
    @NotNull(message = "required")
    private BloodGroup Blood_group;
    @NotNull(message = "required")
    private String aadharnumber;
    @NotNull(message = "required")
    private String address;
    @NotBlank(message = "required")
    private String emergencyContact;
    @NotNull(message = "required")
    private String admitdate;
    @NotBlank(message = "required")
    private String status;

}
