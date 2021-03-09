package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure("com/manytomany/hibernate.cfg.xml").buildSessionFactory();
		
		Employee e1=new Employee();
		e1.setEid(100);
		e1.setName("Priyanka Kulkarni");
		
		Employee e2=new Employee();
		e2.setEid(200);
		e2.setName("Swanand Kirkire");
		
		Employee e3=new Employee();
		e3.setEid(300);
		e3.setName("Arti Gole");
		
		
		Project p1=new Project();
		p1.setPid(1);
		p1.setName("Library Management System");
		
		Project p2=new Project();
		p2.setPid(2);
		p2.setName("Team Management System");
		
		Project p3=new Project();
		p3.setPid(3);
		p3.setName("Medical Pharmacy System");
		
		Project p4=new Project();
		p4.setPid(4);
		p4.setName("College Admission System");
		
		List<Employee> listEmp=new ArrayList<Employee>();
		listEmp.add(e1);
		listEmp.add(e2);
		listEmp.add(e3);
		
		List<Project> listPro=new ArrayList<Project>();
		listPro.add(p1);
		listPro.add(p2);
		
		
		e1.setProjectList(listPro);
		
		p1.setEmpList(listEmp);
		
		
		listPro.add(p4);
		e3.setProjectList(listPro);
		p3.setEmpList(listEmp);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	/*	session.save(e1);
		session.save(e2);
		session.save(p3);
		session.save(e3);
		session.save(p1);
		session.save(p2);
		session.save(p4);*/
		 
		// hql delete
		
	/*	String s="delete from Employee where eid=:x ";
		Query q=session.createQuery(s);
		
		q.setParameter("x", 300);
		
		int r=q.executeUpdate();
		System.out.println("no of rows deleted "+r);
		*/
		// hql update 
	/*	
		String s1="update Employee  set name=:x where eid=:c";
		Query q1=session.createQuery(s1);
		q1.setParameter("x", "Omkar Kulkarni");
		q1.setParameter("c", 100);
		int r1=q1.executeUpdate();
		System.out.println("no of rows updated : "+r1);
		*/
		
		tx.commit();
		session.close();
		
		
		

	}
}
