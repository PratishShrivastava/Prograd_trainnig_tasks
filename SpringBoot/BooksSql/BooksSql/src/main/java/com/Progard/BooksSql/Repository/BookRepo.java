package com.Progard.BooksSql.Repository;

import com.Progard.BooksSql.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Books, Integer> {
}