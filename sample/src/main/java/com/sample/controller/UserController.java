package com.sample.controller;

import com.sample.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class UserController {
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> listOfBooks= new ArrayList<>();
        listOfBooks.add(new Book(1, "Harry Potter", "jk rowling", "jac"));
        listOfBooks.add(new Book(2, "Rich Dad Poor Dad", "Robert TK", "Sparrow"));
        listOfBooks.add(new Book(3, "Ikigai", "Miracles", "Franchisco"));
        return ResponseEntity.ok(listOfBooks);
    }
}
