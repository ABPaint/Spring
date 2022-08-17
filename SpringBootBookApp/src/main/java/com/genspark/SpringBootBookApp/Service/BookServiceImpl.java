package com.genspark.SpringBootBookApp.Service;

import com.genspark.SpringBootBookApp.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    List<Book> list;

    public BookServiceImpl() {
        list = new ArrayList<>();
        list.add(new Book(1234, "Dresden Files", "Jim Butcher"));
        list.add(new Book(1235, "Adventures Wanted", "M. L. Forman"));
        list.add(new Book(1236, "The Calamitous Bob", "Alex Gilbert"));
    }

    @Override
    public List<Book> getAllBook(){
        return list;
    }

    @Override
    public Book getBookById(int bookID) {
        Book c=null;

        for (Book book:list)
        {
            if (book.getBookid()==bookID){
                c = book;
                break;
            }
        }

        return c;
    }

    @Override
    public Book addBook(Book book) {
        list.add(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        String title = book.getTitle();
        String author = book.getAuthor();
        Book c =null;
        for (Book e:list){
            if (e.getBookid()== book.getBookid())
            {
                e.setTitle(title);
                e.setAuthor(author);
            }
        }
        return c;
    }

    @Override
    public String deleteBookById(int bookID) {

        for (Book book:list)
        {
            if (book.getBookid()==bookID){
                list.remove(book);
                break;
            }
        }
        return "Deleted Successfully";
    }

}
