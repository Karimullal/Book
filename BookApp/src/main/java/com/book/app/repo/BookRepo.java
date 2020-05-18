package com.book.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.app.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
