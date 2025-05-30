package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Course;
import com.demo.model.Faculty;

public class TestOneToOneBidirectional {

	public static void main(String[] args) {
		Faculty f=new Faculty(1,"Rama","Java",null);
		Faculty f1=new Faculty(2,"Lalita","C++",null);
		Course c1=new Course(111,"DAC",456,f);
		Course c2=new Course(222,"DBDA",500,f1);
		f.setCr(c1);
		f1.setCr(c2);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(f1);
		sess.save(f);
		sess.save(c1);
		sess.save(c2);
		tr.commit();
		sess.close();
		
		sf.close();
		

	}

}
