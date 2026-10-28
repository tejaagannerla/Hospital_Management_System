package com.example.HospitalManagementSystem.Controller;

import com.example.HospitalManagementSystem.API.API_Response;
import com.example.HospitalManagementSystem.DTO.PatientRequest;
import com.example.HospitalManagementSystem.DTO.PatientResponse;
import com.example.HospitalManagementSystem.Entity.patient;
import com.example.HospitalManagementSystem.Service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService ser;

    @PostMapping("/add")
    public ResponseEntity<API_Response<PatientResponse>> add(@RequestBody PatientRequest pnt){
        PatientResponse pr = ser.add(pnt);
        API_Response ap = new API_Response(HttpStatus.CREATED.value(), true, "patient is added successfully", LocalDateTime.now(),pnt);
        return ResponseEntity.status(HttpStatus.CREATED).body(ap);
    }
    @GetMapping("/all")
    public ResponseEntity<API_Response<List<PatientResponse>>>getall(){
        List<PatientResponse> pr = ser.getall();
        API_Response ap = new API_Response(HttpStatus.CREATED.value(), true, "patient get all details successfully", LocalDateTime.now(),pr);
        return ResponseEntity.status(HttpStatus.CREATED).body(ap);

    }
    @GetMapping("/{id}")
    public ResponseEntity<API_Response<PatientResponse>> getid(@PathVariable Long id){
        PatientResponse pr = ser.getid(id);
        API_Response ap = new API_Response(HttpStatus.CREATED.value(), true, "patient get by id  details ", LocalDateTime.now(),pr);
        return ResponseEntity.status(HttpStatus.CREATED).body(ap);



    }
    @PutMapping("/update/{id}")
    public ResponseEntity<API_Response<PatientResponse>> update(@RequestBody PatientRequest request, @PathVariable Long id) {
        PatientResponse pr = ser.update(request,id);
        API_Response ap = new API_Response(HttpStatus.CREATED.value(), true, "patient is updated ", LocalDateTime.now(),pr);
        return ResponseEntity.status(HttpStatus.CREATED).body(ap);

    }

//    @PutMapping("/update/{id}")
//    public patient update(@RequestBody patient pnt, @PathVariable Long id){
//        return ser.update(pnt,id);
//    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<API_Response<String>>  delete(@PathVariable Long id){
        ser.delete(id);
        API_Response ap = new API_Response(HttpStatus.CREATED.value(), true, "patient is updated ", LocalDateTime.now(),ser);
        return ResponseEntity.status(HttpStatus.CREATED).body(ap);

    }

    }

//
//package com.example.HospitalManagementSystem.Controller;
//import com.example.HospitalManagementSystem.API.API_Response;
//import com.example.HospitalManagementSystem.DTO.PatientRequest;
//import com.example.HospitalManagementSystem.DTO.PatientResponse;
//
//import com.example.HospitalManagementSystem.Service.PatientService;
//import lombok.RequiredArgsConstructor;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@RestController
//@RequestMapping("/home")
//@RequiredArgsConstructor
//public class PatientController {
//
//    private final PatientService ser;
//
//    // ADD PATIENT
//    @PostMapping("/add")
//    public ResponseEntity<API_Response<PatientResponse>> add(
//            @RequestBody PatientRequest pnt) {
//
//        PatientResponse savedPatient = ser.add(pnt);
//
//        API_Response<PatientResponse> response = new API_Response<>(
//                HttpStatus.CREATED.value(),
//                true,
//                "Patient added successfully",
//                LocalDateTime.now(),
//                savedPatient
//        );
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    // GET ALL PATIENTS
//    @GetMapping("/all")
//    public List<PatientResponse> getall() {
//
//        return ser.getall();
//    }
//
//    // GET PATIENT BY ID
//    @GetMapping("/{id}")
//    public PatientResponse getid(@PathVariable Long id) {
//
//        return ser.getid(id);
//    }
//
//    // UPDATE PATIENT
//    @PutMapping("/update/{id}")
//    public PatientResponse update(
//            @RequestBody PatientRequest request,
//            @PathVariable Long id) {
//
//        return ser.update(request, id);
//    }
//
//    // DELETE PATIENT
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<String> delete(@PathVariable Long id) {
//
//        ser.delete(id);
//
//        return ResponseEntity.ok("Patient deleted successfully");
//    }
//}

