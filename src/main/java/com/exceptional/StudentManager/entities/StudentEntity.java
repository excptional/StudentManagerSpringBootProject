package com.exceptional.StudentManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;

@Entity
@Table(name = "student_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private String sex;
    private Double cgpa;
    private Year yop;
}
