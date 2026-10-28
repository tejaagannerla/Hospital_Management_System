package com.example.HospitalManagementSystem.Exception;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound (String message){
        super(message);
    }
}
