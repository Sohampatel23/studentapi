package com.example.student.repo;

import com.example.student.model.Address;
import com.example.student.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
