package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestMyUSer {

	public static void main(String[] args) {
		MyUser u1=new MyUser(12,"Rajan","Baner","a@gmail.com");
		MyUser u2=new MyUser(13,"Revati","Baner","a@gmail.com");
		//it reads hibernate.cfg.xml, and do connection with mysql
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u1);
		session.save(u2);
		tr.commit();

	}

}
