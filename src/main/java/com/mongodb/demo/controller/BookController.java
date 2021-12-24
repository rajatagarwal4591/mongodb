package com.mongodb.demo.controller;

import com.mongodb.demo.dto.Book;
import com.mongodb.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("/getBook/{id}")
    public Optional<Book> getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
    }
}
