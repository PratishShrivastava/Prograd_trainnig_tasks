package com.Progard.BooksSql.Service;

import  com.Progard.BooksSql.Models.Books;
import  com.Progard.BooksSql.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
            this.bookRepo = bookRepo;
    }

    @Override
    public Books saveBook(Books books)
    {
        return bookRepo.save(books);
    }
    @Override
    public List<Books> getAllBooks()
    {
        return bookRepo.findAll();
    }
    @Override
    public Books getBooksById(int isbn)
    {
        return bookRepo.findById(isbn).orElseThrow();
    }
    @Override
    public Books updateBooks(Books books,int isbn)
    {
        Books existingBooks=bookRepo.findById(isbn).orElseThrow();
        existingBooks.setName(books.getName());
        existingBooks.setPrice(books.getPrice());
        existingBooks.setAddress(books.getAddress());
        bookRepo.save(existingBooks);
        return existingBooks;
    }
    @Override
    public void deleteBooks(int isbn)
    {
        bookRepo.findById(isbn).orElseThrow();
        bookRepo.deleteById(isbn);
    }
}