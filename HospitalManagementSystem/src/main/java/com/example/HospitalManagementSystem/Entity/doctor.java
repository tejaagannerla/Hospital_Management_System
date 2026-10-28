package com.example.HospitalManagementSystem.Entity;

import jakarta.persistence.Entity;
import  com.example.HospitalManagementSystem.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
    public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(nullable = false)
    private String specialization;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String qualification;
    @Column(nullable = false)
    private Integer experience;
    @Column(nullable = false)
    private String department;
    @Column(nullable = false)
    private String licenseNumber;
    @Column(nullable = false)
    private String consultationFee;
    @Column(nullable = false)
    private String availability;
    }

