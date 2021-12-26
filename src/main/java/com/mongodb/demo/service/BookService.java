package com.mongodb.demo.service;

import com.mongodb.demo.dto.Book;

import com.mongodb.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public Optional<Book> getBookById(String id) {
        return repository.findById(id);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void deleteBook(String id) {
        repository.deleteById(id);
    }

    public List<Book> getBookByName(String name) {
        return repository.findByName(name);
    }

    public List<Book> getBookByNameAndAuthor(String name, String author) {
        return repository.findByNameAndAuthor(name,author);
    }

    public List<Book> getAllBooksByPage(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1,pageSize);
        return repository.findAll(pageable).getContent();
    }

    public List<Book> getAllBooksSortedBySsn() {
        Sort sort=Sort.by(Sort.Direction.ASC,"ssn");
        return repository.findAll(sort);
    }

    public List<Book> getAllBooksByDeptName(String deptName) {
        return repository.findByDepartmentDeptName(deptName);
    }

    public List<Book> getNameLike(String name) {
        return repository.findByNameIsLike(name);
    }

    public List<Book> byNameStartsWith(String name) {
        return repository.findByNameStartsWith(name);
    }
}

