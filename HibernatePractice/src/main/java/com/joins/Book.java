package com.joins;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="book_details")
public class Book {
	@Id
	@Column(name="book_id")
	int Id;
	
	@Column(name="book_title", length=50)
	private String title;
	
	@Column(name="book_price")
	private float price;
	
	@Temporal(TemporalType.DATE)
	private Date publicating_date;
	
	@ManyToOne
	private Author author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param title
	 * @param price
	 */
	public Book(int id, String title, float price) {
		super();
		Id = id;
		this.title = title;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the publication_date
	 */
	public Date getPublication_date() {
		return publicating_date;
	}

	/**
	 * @param publication_date the publication_date to set
	 */
	public void setPublication_date(Date publicating_date) {
		this.publicating_date = publicating_date;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
/*
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", price=" + price + ", publicating_date=" + publicating_date
				+ ", author=" + author + "]";
	}*/
	
}
