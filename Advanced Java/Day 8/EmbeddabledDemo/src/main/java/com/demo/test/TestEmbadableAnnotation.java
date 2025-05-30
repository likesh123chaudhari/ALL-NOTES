package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestEmbadableAnnotation {

	public static void main(String[] args) {
		Address addr=new Address(1,"s.b.rd","pune","MH");
		MyUser u1=new MyUser(103,"Arti","4444",addr);
		Address addr1=new Address(2,"Baner","pune","MH");
		MyUser u2=new MyUser(203,"Revati","555",addr1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess1=sf.openSession();
		Transaction tr=sess1.beginTransaction();
		sess1.save(u1);
		sess1.save(u2);
		tr.commit();
		Session sess2=sf.openSession();
		Transaction tr1=sess2.beginTransaction();
		//early binding
		//MyUser u11=sess2.get(MyUser.class,200);
		//lazy loading
		MyUser u11=sess2.load(MyUser.class,200);
		System.out.println("display object");
		System.out.println("display object");
		System.out.println("display object");
		System.out.println("display object");
		System.out.println(u11.getUname()+"---"+u11.getAddr());
		sess1.close();
		sess2.close();
		sf.close();
		

	}

}
