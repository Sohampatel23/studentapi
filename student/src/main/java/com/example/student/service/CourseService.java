package com.example.student.service;

import com.example.student.model.Course;
import com.example.student.repo.IAddressRepo;
import com.example.student.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;

    public String addCourse(Course course) {
        iCourseRepo.save(course);
        return "course added";
    }

    public List<Course> getAllCourse() {
       return iCourseRepo.findAll();
    }
}
