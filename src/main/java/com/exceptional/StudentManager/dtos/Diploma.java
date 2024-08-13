package com.exceptional.StudentManager.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diploma {
    private String diploma_sgpa_sem1;
    private String diploma_sgpa_sem2;
    private String diploma_sgpa_sem3;
    private String diploma_sgpa_sem4;
    private String diploma_sgpa_sem5;
    private String diploma_sgpa_sem6;
    private String diploma_ogpa;
    private String diploma_pct_sem1;
    private String diploma_pct_sem2;
    private String diploma_pct_sem3;
    private String diploma_pct_sem4;
    private String diploma_pct_sem5;
    private String diploma_pct_sem6;
    private String diploma_opct;
    private String yop_diploma;
}
