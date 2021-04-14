package com.aop.borrowbooks.service;

import com.aop.borrowbooks.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    void save(Book book);
}
