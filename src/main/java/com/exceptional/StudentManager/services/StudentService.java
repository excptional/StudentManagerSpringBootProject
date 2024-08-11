package com.exceptional.StudentManager.services;

import com.exceptional.StudentManager.dtos.StudentDTO;
import com.exceptional.StudentManager.entities.StudentEntity;
import com.exceptional.StudentManager.repos.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    //Instead of the @autowired we used final
    //Because with the @autowired we can change the object. That's why Constructor Injection is a better approach.
    final StudentRepository studentRepository;
    final ModelMapper modelMapper;

    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    public StudentDTO getStudentById(long id) {
        StudentEntity studentEntity = studentRepository.getById(id);
        return modelMapper.map(studentEntity, StudentDTO.class);
    }

    public StudentDTO registerStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = modelMapper.map(studentDTO, StudentEntity.class);
        return modelMapper.map(studentRepository.save(studentEntity), StudentDTO.class);
    }

    public List<StudentDTO> getAllStudent() {
        List<StudentDTO> list = new ArrayList<>();
        for(StudentEntity studentEntity: studentRepository.findAll()) {
            list.add(modelMapper.map(studentEntity, StudentDTO.class));
        }
        return list;
    }

    public void deleteStudentById(long id) {
        if(studentRepository.existsById(id))
            studentRepository.deleteById(id);
    }

}
