package com.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbaddableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("com/embeddable/hibernate.cfg.xml");
	   SessionFactory factory= cfg.buildSessionFactory();
	   
	   // Student object 
	   
	  Student s1=new Student();
	  s1.setId(105);
	  s1.setName("priyanka kulkarni");
	  s1.setCity("Pune");
	  
	  Student s2=new Student();
	  s2.setId(106);
	  s2.setName("Anand Gole");
	  s2.setCity("Beed");
	  
	  Certificate c1=new Certificate();
	  c1.setCourseName("Spring Freamwork");
	  c1.setDuration("2 months");
	  s1.setCertificate(c1);
	  
	  Certificate c2=new Certificate();
	  c2.setCourseName("Spring Freamwork");
	  c2.setDuration("2 months");
	  s2.setCertificate(c2);
	 
	     
	    Session session=factory.openSession();
	    Transaction t=session.beginTransaction();
	    
	    session.save(s1);
	    session.save(s2);
	    
	    t.commit();
	    
	    session.clear();

	}

}
