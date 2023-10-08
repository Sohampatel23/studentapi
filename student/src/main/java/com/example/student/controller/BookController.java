package com.example.student.controller;

import com.example.student.model.Address;
import com.example.student.model.Book;
import com.example.student.service.AddressService;
import com.example.student.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("books")
    public String addBooks(@RequestBody Book book)
    {
        return bookService.addBook(book);
    }

    @GetMapping("AllAddress")
    public List<Book> getAllBook()
    {
        return bookService.getAllBook();
    }

}
