package com.Progard.BooksSql.Controllers;

import com.Progard.BooksSql.Models.Books;
import com.Progard.BooksSql.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public ResponseEntity<Books> saveBook(@RequestBody Books books)
    {
        return new ResponseEntity<Books>(bookService.saveBook(books), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Books> getAllBooks()
    {
        return bookService.getAllBooks();
    }
    @GetMapping("{isbn}")
    public ResponseEntity<Books> getBooksById(@PathVariable("isbn")int isbn)
    {
        return new ResponseEntity<Books>(bookService.getBooksById(isbn),HttpStatus.OK);
    }
    @PutMapping("{isbn}")
    public ResponseEntity<Books> updateBooks(@PathVariable("isbn")int isbn,@RequestBody Books books)
    {
        return new ResponseEntity<Books>(bookService.updateBooks(books,isbn), HttpStatus.OK);
    }
    @DeleteMapping("{isbn}")
    public ResponseEntity<String> deleteBooks(@PathVariable("isbn")int isbn)
    {
        bookService.deleteBooks(isbn);
        return new ResponseEntity<String>("Books deleted successfully",HttpStatus.OK);
    }
}
