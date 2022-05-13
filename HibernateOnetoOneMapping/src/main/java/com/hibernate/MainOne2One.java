package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOne2One {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session se = factory.openSession();
		Transaction tx = se.beginTransaction();
		Que q = new Que();
		q.setId(10);
		q.setQue_Name("JAVA");
		
		Que q1 = new Que();
		q1.setId(11);
		q1.setQue_Name("JDK");
		
		Que q2 = new Que();
		q2.setId(12);
		q2.setQue_Name("MYSQL");
		
		Ans an = new Ans();
		an.setAns_Id(103);
		an.setAns_Solution("Software");
		q.setAnsID(an);
		
		Ans an1 = new Ans();
		an1.setAns_Id(104);
		an1.setAns_Solution("Software");
		q1.setAnsID(an1);
		
		Ans an2 = new Ans();
		an2.setAns_Id(105);
		an2.setAns_Solution("Software");
		q2.setAnsID(an2);
		
		se.save(q);
		se.save(an);
		se.save(q1);
		se.save(an1);
		se.save(q2);
		se.save(an2);
		//se.update(q);
		//se.delete(an);
		tx.commit();
		se.close();
		factory.close();
	}
}
