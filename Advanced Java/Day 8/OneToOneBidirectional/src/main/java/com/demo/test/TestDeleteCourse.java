package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Faculty;

public class TestDeleteCourse {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Faculty f11=sess.get(Faculty.class, 1);
		System.out.println(f11.getFname());
		sess.delete(f11);
		System.out.println("after delete");
		System.out.println(f11.getFname());//+"-----"+f11.getCr().getDuration());
		tr.commit();
		sess.close();
		
		sf.close();

	}

}
