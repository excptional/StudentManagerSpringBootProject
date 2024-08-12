package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.time.LocalDate;
import java.time.Year;

@Data //Use for getter() and setter() functions
@AllArgsConstructor // Use for the constructor
@NoArgsConstructor // By default constructor
public class StudentDTO {
    private Long id;
    private String email;
    private String name;
    private String address;
    private String phone_no;
    private String roll_no;
    private String registration_no;
    private String dept;
    private LocalDate dob;
    private String sex;
    private String course_type;

    private School school;
    private Diploma diploma;
    private BE be;

    private String pref_job_roles;
    private Boolean prof_exp;
    private URL linked_in;
    private URL github;
    private URL resume;
}
