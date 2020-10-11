package com.pd.controller;

import com.pd.model.Book;
import com.pd.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository repository;

    @GetMapping("book")
    private List<Book> getAllBooks(){
        return repository.findAll();
    }

    @GetMapping("book/{bookId}")
    private Book getBook(@PathVariable("bookId") int bookId){
        return repository.findById(bookId).get();
    }
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid){
        repository.deleteById(bookid);
    }

    @PostMapping("/book")
    private int save(@RequestBody Book book){
        repository.save(book);
        return book.getBookId();
    }
    @PutMapping("/book")
    private Book update(@RequestBody Book book){
        repository.save(book);
        return book;
    }

}
