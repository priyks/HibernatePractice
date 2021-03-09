package com.xmlmapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class XmlMappingDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/xmlmapping/hibernate.cfg.xml")
				.buildSessionFactory();

		Person p = new Person();
		p.setId(10);
		p.setName("prashant");
		p.setAge(40);
		p.setCity("beed");
		
		Job fulltime=new Job();
		fulltime.setId(111);
		fulltime.setDesignation("Software Developer");
		fulltime.setSalary(78000.00f);
		fulltime.setPerson(p);
		
		Job halftime=new Job();
		halftime.setId(222);
		halftime.setDesignation("Blog Writer");
		halftime.setSalary(6000.00f);
		halftime.setPerson(p);
		
		Set<Job> jobs=new HashSet<Job>();
		jobs.add(fulltime);
		jobs.add(halftime);
		
		p.setJobs(jobs);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(p);
		session.save(fulltime);
		session.save(halftime);
		
		Criteria criteria=session.createCriteria(Person.class);
		criteria.add(Restrictions.ilike("name", "prash%"));
		List<Person> cp=criteria.list();
		
		for(Person pc:cp) {
			
			System.out.println(pc);
		}
		
		
		tx.commit();
		session.close();

	}
}
