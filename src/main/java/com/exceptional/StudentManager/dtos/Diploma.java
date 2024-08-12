package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diploma {
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
}
