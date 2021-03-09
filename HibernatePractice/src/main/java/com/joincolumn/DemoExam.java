package com.joincolumn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("com/joincolumn/hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();

		// Question Object
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java ?");

		// Answer object
		Answer a1 = new Answer();
		a1.setAnswerId(345);
		a1.setAnswer("Java is a Programming lunaguage");
		//a1.setQuestion(q1);

		q1.setAnswerId(a1);

		// Question Object
		Question q2 = new Question();
		q2.setQuestionId(9898);
		q2.setQuestion("What is Collection ?");

		// Answer object
		Answer a2 = new Answer();
		a2.setAnswerId(888);
		a2.setAnswer("Collection is API which is group of objects ");
		//a2.setQuestion(q2);

		q2.setAnswerId(a2);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		tx.commit();
		
		
		
		session.close();
		

	}

}
