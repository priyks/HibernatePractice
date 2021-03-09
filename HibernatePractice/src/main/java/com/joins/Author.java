package com.joins;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table(name="author_details")
public class Author {
	
	@Id
	private int id;
	
	@Column(name="author_name", length=50)
	private String fullName;
	
	@Column(nullable=true)
	private String city;
	
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL) // it will persist,delete and update all related objects 
	@Column(name="book_id")
	private List<Book> books;

	public Author() {
		super();
	}
	/**
	 * @param id
	 * @param fullName
	 * @param city
	 * @param books
	 */
	public Author(int id, String fullName, String city, List<Book> books) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.city = city;
		this.books = books;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", fullName=" + fullName + ", city=" + city + ", books=" + books + "]";
	}

}
