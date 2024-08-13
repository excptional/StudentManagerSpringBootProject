package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private String pct_10th;
    private String yop_10th;
    private String pct_12th;
    private String yop_12th;
    private String phys_marks_12th;
    private String chem_marks_12th;
    private String math_marks_12th;
}
