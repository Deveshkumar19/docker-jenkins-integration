package com.devesh.springdockerjenkins.controller;

import com.devesh.springdockerjenkins.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/getBook")
    public List<Book> getBook(){

        return Arrays.asList(
                new Book("Java","devesh",300),
                new Book("J2ee","deveshkr",800)
        );
    }
}
