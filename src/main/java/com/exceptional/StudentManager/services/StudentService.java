package com.exceptional.StudentManager.services;

import com.exceptional.StudentManager.dtos.BE;
import com.exceptional.StudentManager.dtos.Diploma;
import com.exceptional.StudentManager.dtos.School;
import com.exceptional.StudentManager.dtos.StudentDTO;
import com.exceptional.StudentManager.entities.StudentEntity;
import com.exceptional.StudentManager.repos.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    //Instead of the @autowired we used final
    //Because with the @autowired we can change the object. That's why Constructor Injection is a better approach.
    final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO getStudentByRollNo(String rollNo) {
        StudentEntity studentEntity = studentRepository.findByRollNo(rollNo);
        return entityToDTO(studentEntity);
    }

    public StudentDTO registerStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = dtoToEntity(studentDTO);
        return entityToDTO(studentRepository.save(studentEntity));
    }

    public List<StudentDTO> getAllStudent() {
        List<StudentDTO> list = new ArrayList<>();
        for (StudentEntity studentEntity : studentRepository.findAll()) {
            list.add(entityToDTO(studentEntity));
        }
        return list;
    }

    public void deleteStudentById(long id) {
        if (studentRepository.existsById(id))
            studentRepository.deleteById(id);
    }

    private StudentDTO entityToDTO(StudentEntity se) {
        return new StudentDTO(se.getId(), se.getEmail(), se.getName(), se.getAddress(), se.getPhone_no(), se.getRoll_no(),
                se.getRegistration_no(), se.getDept(), se.getDob(), se.getSex(), se.getCourse_type(),
                new School(se.getPct_10th(), se.getYop_10th(), se.getPct_12th(), se.getYop_12th(),
                        se.getPhys_marks_12th(), se.getChem_marks_12th(), se.getMath_marks_12th()),
                new Diploma(se.getDiploma_sgpa_sem1(), se.getDiploma_sgpa_sem2(), se.getDiploma_sgpa_sem3(),
                        se.getDiploma_sgpa_sem4(), se.getDiploma_sgpa_sem5(), se.getDiploma_sgpa_sem6(),
                        se.getDiploma_ogpa(), se.getDiploma_pct_sem1(), se.getDiploma_pct_sem2(),
                        se.getDiploma_pct_sem3(), se.getDiploma_pct_sem4(), se.getDiploma_pct_sem5(),
                        se.getDiploma_pct_sem6(), se.getDiploma_opct(), se.getYop_diploma()),
                new BE(se.getBe_sgpa_sem1(), se.getBe_sgpa_sem2(), se.getBe_sgpa_sem3(), se.getBe_sgpa_sem4(),
                        se.getBe_sgpa_sem5(), se.getBe_sgpa_sem6(), se.getBe_sgpa_sem7(), se.getBe_sgpa_sem8(),
                        se.getBe_cgpa(), se.getBe_pct_sem1(), se.getBe_pct_sem2(), se.getBe_pct_sem3(),
                        se.getBe_pct_sem4(), se.getBe_pct_sem5(), se.getBe_pct_sem6(), se.getBe_pct_sem7(),
                        se.getBe_pct_sem8(), se.getBe_opct(), se.getYop_be(), se.getBacklogs(), se.getBack_papers()),
                se.getPref_job_roles(), se.getProf_exp(), se.getLinked_in(), se.getGithub(), se.getResume());
    }

    private StudentEntity dtoToEntity(StudentDTO sdto) {
        return new StudentEntity(sdto.getId(), sdto.getEmail(), sdto.getName(), sdto.getAddress(), sdto.getPhone_no(), sdto.getRoll_no(),
                sdto.getRegistration_no(), sdto.getDept(), sdto.getDob(), sdto.getSex(), sdto.getCourse_type(),
                sdto.getSchool().getPct_10th(), sdto.getSchool().getYop_10th(), sdto.getSchool().getPct_12th(), sdto.getSchool().getYop_12th(),
                sdto.getSchool().getPhys_marks_12th(), sdto.getSchool().getChem_marks_12th(), sdto.getSchool().getMath_marks_12th(),
                sdto.getDiploma().getDiploma_sgpa_sem1(), sdto.getDiploma().getDiploma_sgpa_sem2(), sdto.getDiploma().getDiploma_sgpa_sem3(),
                sdto.getDiploma().getDiploma_sgpa_sem4(), sdto.getDiploma().getDiploma_sgpa_sem5(), sdto.getDiploma().getDiploma_sgpa_sem6(),
                sdto.getDiploma().getDiploma_ogpa(), sdto.getDiploma().getDiploma_pct_sem1(), sdto.getDiploma().getDiploma_pct_sem2(),
                sdto.getDiploma().getDiploma_pct_sem3(), sdto.getDiploma().getDiploma_pct_sem4(), sdto.getDiploma().getDiploma_pct_sem5(),
                sdto.getDiploma().getDiploma_pct_sem6(), sdto.getDiploma().getDiploma_opct(), sdto.getDiploma().getYop_diploma(),
                sdto.getBe().getBe_sgpa_sem1(), sdto.getBe().getBe_sgpa_sem2(), sdto.getBe().getBe_sgpa_sem3(), sdto.getBe().getBe_sgpa_sem4(),
                sdto.getBe().getBe_sgpa_sem5(), sdto.getBe().getBe_sgpa_sem6(), sdto.getBe().getBe_sgpa_sem7(), sdto.getBe().getBe_sgpa_sem8(),
                sdto.getBe().getBe_cgpa(), sdto.getBe().getBe_pct_sem1(), sdto.getBe().getBe_pct_sem2(), sdto.getBe().getBe_pct_sem3(),
                sdto.getBe().getBe_pct_sem4(), sdto.getBe().getBe_pct_sem5(), sdto.getBe().getBe_pct_sem6(), sdto.getBe().getBe_pct_sem7(),
                sdto.getBe().getBe_pct_sem8(), sdto.getBe().getBe_opct(), sdto.getBe().getYop_be(), sdto.getBe().getBacklogs(), sdto.getBe().getBack_papers(),
                sdto.getPref_job_roles(), sdto.getProf_exp(), sdto.getLinked_in(), sdto.getGithub(), sdto.getResume());
    }
}
