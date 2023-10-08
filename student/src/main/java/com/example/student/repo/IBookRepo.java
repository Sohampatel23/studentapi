package com.example.student.repo;

import com.example.student.model.Address;
import com.example.student.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
