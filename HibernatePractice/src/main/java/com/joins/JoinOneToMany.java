package com.joins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JoinOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure("com/joins/hibernate.cfg.xml").buildSessionFactory();
		
		// one author have many books
	/*
		Author author=new Author();
		author.setId(111);
		author.setFullName("Paulo Coelho");
		author.setCity("beijing");
		
		// book 1
		Book b1=new Book(); 
		b1.setId(1);
		b1.setTitle("The Alchemist");
		b1.setPrice(350);
		b1.setPublication_date(new Date());
		b1.setAuthor(author);
		
		
		// book 2
		Book b2=new Book();
		b2.setId(2);
		b2.setTitle("Rich Dad, Poor Dad");
		b2.setPrice(400);
		b2.setPublication_date(new Date());
		b2.setAuthor(author);
		
		// book 3
		Book b3=new Book();
		b3.setId(3);
		b3.setTitle("think and grow rich");
		b3.setPublication_date(new Date());
		b3.setPrice(600);
		b3.setAuthor(author);

		List<Book> booksList=new ArrayList<Book>();
		booksList.add(b1);
		booksList.add(b2);
		booksList.add(b3);
		
		author.setBooks(booksList);*/
	
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	/*	
	session.save(author);
		session.save(b1);
		session.save(b2);
		session.save(b3);*/
		tx.commit();
	    Author authordetails=(Author)session.get(Author.class,111); // lazy loading 
	   /* System.out.println("book Author :"+authordetails.getFullName());
	    System.out.println("City :"+authordetails.getCity());
	    System.out.println(authordetails.getBooks().size()); // lazy loading 
	    System.out.println("Book list : ");
	    for(Book b:authordetails.getBooks()) {
	    	System.out.println(b.getTitle()+" :  book price :"+b.getPrice());
	    }*/
	    
	    // HQL
	    String query="from Author as a where a.fullName=:x";
	    Query q=session.createQuery(query);
	    q.setParameter("x", "Paulo Coelho");
	    List<Author> books=q.list();
	    for(Author b: books) {
	    	System.out.println(b.getId());
	    }
	    
	    
	    
	   
		session.close();
		
	}

}
