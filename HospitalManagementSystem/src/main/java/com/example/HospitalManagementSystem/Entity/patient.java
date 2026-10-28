package com.example.HospitalManagementSystem.Entity;

import com.example.HospitalManagementSystem.Enum.BloodGroup;
import com.example.HospitalManagementSystem.Enum.Gender;
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
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String patientcode;
    @Column(nullable = false)
    private int  age;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(nullable = false)
    private String aadharnumber;
    @Column(nullable = false)
    private String phonenumber;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String admitdate;
    @Column(nullable = false)
    private String emergencyContact;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BloodGroup Blood_group;
    @Column(nullable = false)
    private String email;

}
