package com.example.student.controller;

import com.example.student.model.Address;
import com.example.student.model.Laptop;
import com.example.student.service.AddressService;
import com.example.student.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("Laptop")
    public String addLaptop(@RequestBody Laptop laptop)
    {
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("AllAddress")
    public List<Laptop> getAllLaptop()
    {
        return laptopService.getAllLaptop();
    }

}
