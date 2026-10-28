package com.example.HospitalManagementSystem.DTO;

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
public class DoctorRequest {
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "gender is required")
    private String gender;
    @NotBlank(message = "specialization is required")
    private String specialization;
    @Email(message = "invalid email format")
    @NotBlank(message = "email is required")
    private String email;
    @NotBlank(message = "phone number is required")
    @Pattern(regexp = "[6-9]\\d{9}", message = "invalid number")
    private String phone;
    @NotBlank(message = "address is required")
    private String address;
    @NotBlank(message = "qualification is required")
    private String qualification;
    @NotNull(message = "experience is required")
    private Integer experience;
    @NotBlank(message = "department is required")
    private String department;
    @NotBlank(message = "license number is required")
    private String licenseNumber;
    @NotNull(message = "consultation fee is required")
    private Double consultationFee;
    @NotBlank(message = "availability is required")
    private String availability;
}