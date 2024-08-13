package com.exceptional.StudentManager.controllers;

import com.exceptional.StudentManager.dtos.StudentDTO;
import com.exceptional.StudentManager.services.StudentService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/{rollNo}")
    public StudentDTO getStudentById(@PathVariable("rollNo") String rollNo) {
        return studentService.getStudentByRollNo(rollNo);
    }

    @GetMapping(path = "/all")
    public List<StudentDTO> getAllStudent() {
        return studentService.getAllStudent();
    }

    @Hidden
    @PostMapping
    public StudentDTO registerStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.registerStudent(studentDTO);
    }

    @Hidden
    @DeleteMapping(path = "/{id}")
    public void deleteStudentById(@PathVariable("id") long studentId) {
        studentService.deleteStudentById(studentId);
    }

}
