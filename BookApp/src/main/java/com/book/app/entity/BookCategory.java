package com.book.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_BOOK_CATEGORY")
public class BookCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String bookCategory;
	@OneToMany(mappedBy = "categories", cascade = CascadeType.ALL)
	private Set<Book> books = new HashSet<Book>();

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the bookCategory
	 */
	public String getBookCategory() {
		return bookCategory;
	}

	/**
	 * @param bookCategory the bookCategory to set
	 */
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void addBooks(Book books) {
		this.books.add(books);
	}

}
