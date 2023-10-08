package com.example.student.service;

import com.example.student.model.Book;
import com.example.student.repo.IAddressRepo;
import com.example.student.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo iBookRepo;

    public String addBook(Book book) {
        iBookRepo.save(book);
        return "book added";
    }

    public List<Book> getAllBook() {
        return  iBookRepo.findAll();
    }
}
