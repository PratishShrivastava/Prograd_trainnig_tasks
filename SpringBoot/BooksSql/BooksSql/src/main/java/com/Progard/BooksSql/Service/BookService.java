package com.Progard.BooksSql.Service;

import com.Progard.BooksSql.Models.Books;

import java.util.List;

public interface BookService {
    Books saveBook(Books books);
    List<Books> getAllBooks();
    Books getBooksById(int isbn);
    Books updateBooks(Books books,int isbn);
    void deleteBooks(int isbn);
}