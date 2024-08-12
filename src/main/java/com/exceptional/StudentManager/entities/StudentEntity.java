package com.exceptional.StudentManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.time.LocalDate;
import java.time.Year;

@Entity
@Table(name = "StudentData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    //school
    private Double pct_10th;
    private Year yop_10th;
    private Double pct_12th;
    private Year yop_12th;
    private Integer phys_marks_12th;
    private Integer chem_marks_12th;
    private Integer math_marks_12th;
    //Diploma
    private Double diploma_sgpa_sem1;
    private Double diploma_sgpa_sem2;
    private Double diploma_sgpa_sem3;
    private Double diploma_sgpa_sem4;
    private Double diploma_sgpa_sem5;
    private Double diploma_sgpa_sem6;
    private Double diploma_ogpa;
    private Double diploma_pct_sem1;
    private Double diploma_pct_sem2;
    private Double diploma_pct_sem3;
    private Double diploma_pct_sem4;
    private Double diploma_pct_sem5;
    private Double diploma_pct_sem6;
    private Double diploma_opct;
    private Year yop_diploma;
    //BE
    private Double be_sgpa_sem1;
    private Double be_sgpa_sem2;
    private Double be_sgpa_sem3;
    private Double be_sgpa_sem4;
    private Double be_sgpa_sem5;
    private Double be_sgpa_sem6;
    private Double be_sgpa_sem7;
    private Double be_sgpa_sem8;
    private Double be_cgpa;
    private Double be_pct_sem1;
    private Double be_pct_sem2;
    private Double be_pct_sem3;
    private Double be_pct_sem4;
    private Double be_pct_sem5;
    private Double be_pct_sem6;
    private Double be_pct_sem7;
    private Double be_pct_sem8;
    private Double be_opct;
    private Year yop_be;
    private Long backlogs;
    private String back_papers;
    //--------------------------
    private String pref_job_roles;
    private Boolean prof_exp;
    private URL linked_in;
    private URL github;
    private URL resume;
}
