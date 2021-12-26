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
    public Optional<Book> getBookById(@PathVariable String id){
        return bookService.getBookById(id);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

    @GetMapping("/getBookByName/{name}")
    public List<Book> getBookByName(@PathVariable String name){
        return bookService.getBookByName(name);
    }

    @GetMapping("/getBookByNameAndAuthor")
    public List<Book> getBookByNameAndAuthor(@RequestParam String name,@RequestParam String author){
        return bookService.getBookByNameAndAuthor(name,author);
    }

    @GetMapping("/allWithPagination")
    public List<Book> getAllBooksByPage(@RequestParam int pageNo,@RequestParam int pageSize){
        return bookService.getAllBooksByPage(pageNo,pageSize);
    }

    @GetMapping("/allWithSorting")
    public List<Book> getAllBooksSortedBySsn(){
        return bookService.getAllBooksSortedBySsn();
    }

    @GetMapping("/byDepartmentName")
    public List<Book> byDepartmentName(@RequestParam String deptName) {
        return bookService.getAllBooksByDeptName(deptName);
    }

    @GetMapping("/byNameLike")
    public List<Book> byNameLike(@RequestParam String name) {
        return bookService.getNameLike(name);
    }

    @GetMapping("/byNameStartsWith")
    public List<Book> byNameStartsWith(@RequestParam String name) {
        return bookService.byNameStartsWith(name);
    }
}
