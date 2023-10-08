package com.example.student.repo;


import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
