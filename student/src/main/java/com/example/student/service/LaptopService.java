package com.example.student.service;

import com.example.student.model.Laptop;
import com.example.student.repo.IAddressRepo;
import com.example.student.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(Laptop laptop) {
        iLaptopRepo.save(laptop);
        return "Laptop added";
    }

    public List<Laptop> getAllLaptop() {
        return iLaptopRepo.findAll();
    }
}
