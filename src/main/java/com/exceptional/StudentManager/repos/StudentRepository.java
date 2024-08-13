package com.exceptional.StudentManager.repos;

import com.exceptional.StudentManager.entities.StudentEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    @Query("SELECT s FROM StudentEntity s WHERE s.roll_no = :rollNo")
    StudentEntity findByRollNo(@Param("rollNo") String rollNo);

}
