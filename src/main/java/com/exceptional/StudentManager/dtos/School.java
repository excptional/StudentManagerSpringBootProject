package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private Double pct_10th;
    private Year yop_10th;
    private Double pct_12th;
    private Year yop_12th;
    private Integer phys_marks_12th;
    private Integer chem_marks_12th;
    private Integer math_marks_12th;
}
