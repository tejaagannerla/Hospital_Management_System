package com.example.HospitalManagementSystem.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class API_Response<T> {
    private int status;
    private boolean success;
    private String Message;
    private LocalDateTime timestamp;
    private T data;
}
