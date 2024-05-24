package com.example.api.service;

import com.example.api.pojo.Book;
import com.example.api.pojo.ResultBook;

public interface BookService {
    ResultBook addBook(Book book);
    ResultBook delete(Long id);
    ResultBook  findByName(String name);
    ResultBook  findByAuthor(String author);
    ResultBook update(Book book);
    ResultBook sayHello();
}
