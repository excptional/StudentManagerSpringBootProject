package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;

@Data //Use for getter() and setter() functions
@AllArgsConstructor // Use for the constructor
@NoArgsConstructor // By default constructor
public class StudentDTO {
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private String sex;
    private Double cgpa;
    private Year yop;
}
