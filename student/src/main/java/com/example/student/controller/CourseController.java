package com.example.student.controller;

import com.example.student.model.Address;
import com.example.student.model.Course;
import com.example.student.service.AddressService;
import com.example.student.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }

    @GetMapping("Allcourse")
    public List<Course> getAllCourse()
    {
        return courseService.getAllCourse();
    }

}
