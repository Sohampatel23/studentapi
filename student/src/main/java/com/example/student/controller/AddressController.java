package com.example.student.controller;

import com.example.student.model.Address;
import com.example.student.model.Student;
import com.example.student.service.AddressService;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }

    @GetMapping("AllAddress")
    public List<Address> getAllStudent()
    {
        return addressService.getAllAddress();
    }

}
