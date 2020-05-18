package com.book.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_BOOK")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String bookName;
	private String price;
	private Double bookCode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categorie_id")
	private BookCategory categories;

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
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the bookCode
	 */
	public Double getBookCode() {
		return bookCode;
	}

	/**
	 * @param bookCode the bookCode to set
	 */
	public void setBookCode(Double bookCode) {
		this.bookCode = bookCode;
	}

}
