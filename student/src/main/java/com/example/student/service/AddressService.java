package com.example.student.service;

import com.example.student.model.Address;
import com.example.student.model.Student;
import com.example.student.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address added";
    }

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }
}
