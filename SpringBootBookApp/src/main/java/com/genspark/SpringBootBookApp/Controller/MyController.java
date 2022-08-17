package com.genspark.SpringBootBookApp.Controller;

import com.genspark.SpringBootBookApp.Entity.Book;
import com.genspark.SpringBootBookApp.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks()
    {
        return this.bookService.getAllBook();
    }

    @GetMapping("/books/{bookID}")
    public Book getBook(@PathVariable String bookID)
    {
        return this.bookService.getBookById(Integer.parseInt(bookID));
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book)
    {
        return this.bookService.addBook(book);
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book)
    {
        return this.bookService.updateBook(book);
    }

    @DeleteMapping("/books/{bookID}")
    public String deleteBook(@PathVariable String bookID)
    {
        return this.bookService.deleteBookById(Integer.parseInt(bookID));
    }

}
