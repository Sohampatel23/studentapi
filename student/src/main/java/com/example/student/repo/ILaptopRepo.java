package com.example.student.repo;

import com.example.student.model.Address;
import com.example.student.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
