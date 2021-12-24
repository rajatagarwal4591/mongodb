package com.mongodb.demo.service;

import com.mongodb.demo.dto.Book;

import com.mongodb.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public Optional<Book> getBookById(int id) {
        return repository.findById(id);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void deleteBook(int id) {
        repository.deleteById(id);
    }
}
