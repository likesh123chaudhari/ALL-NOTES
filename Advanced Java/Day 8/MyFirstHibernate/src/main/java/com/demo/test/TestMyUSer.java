package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;
import com.demo.model.Product;

public class TestMyUSer {

	public static void main(String[] args) {
		//transient, new
		MyUser u1=new MyUser(133,"Atharva","Baner","a@gmail.com");
		MyUser u2=new MyUser(144,"Arti","Baner","a@gmail.com");
		Product p1=new Product("lays",23,45);
		Product p2=new Product("Maggi",10,60);
		//it reads hibernate.cfg.xml, and do connection with mysql
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//persistence state
		session.save(u1);
		session.save(u2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		//terminate the databse connection
		sf.close();

	}

}
