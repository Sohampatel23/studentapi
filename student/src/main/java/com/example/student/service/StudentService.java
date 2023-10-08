package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public String addStud(Student student) {
        iStudentRepo.save(student);
        return "Student added";
    }

    public List<Student> getALl() {
        return (List<Student>) iStudentRepo.findAll();
    }
}
