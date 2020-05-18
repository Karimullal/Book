package com.book.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.app.entity.BookCategory;

public interface BookCategoryRepo extends JpaRepository<BookCategory, Integer>{

}
