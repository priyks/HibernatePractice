package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
       /* SessionFactory factory=new Configuration().configure().buildSessionFactory();*/ 
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.isClosed());
        Student st=new Student();
        st.setId(102);
        st.setName("Rushikesh");
        st.setCity("Beed");
        System.out.println(st);
        
        
        Address ad=new Address();
        ad.setStreet("Shahu College Road");
        ad.setCity("Pune");
        ad.setDate(new Date()); 
        ad.setX(78.987);
        ad.setOpen(true);
        
        FileInputStream fis=new FileInputStream("src/main/java/collection.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(ad);
        session.save(st);
        session.getTransaction().commit();
        session.clear();
        
    }
}
