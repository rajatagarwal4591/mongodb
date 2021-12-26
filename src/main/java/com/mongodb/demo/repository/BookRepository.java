package com.mongodb.demo.repository;

import com.mongodb.demo.dto.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {

    List<Book> findByName(String name);
    List<Book> findByNameAndAuthor(String name, String author);

    List<Book> findByDepartmentDeptName(String deptName);

    List<Book> findByNameIsLike(String name);

    List<Book> findByNameStartsWith(String name);
}
