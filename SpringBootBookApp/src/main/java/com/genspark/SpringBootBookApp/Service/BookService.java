package com.genspark.SpringBootBookApp.Service;

import com.genspark.SpringBootBookApp.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();
    Book getBookById(int bookID);
    Book addBook(Book book);
    Book updateBook(Book book);
    String deleteBookById(int bookID);

}
