package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BE {
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
}
