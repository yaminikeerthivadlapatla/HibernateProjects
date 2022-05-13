package com.hibernate.one2many;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainMany2One {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory Factory = new Configuration().configure().buildSessionFactory();
		Session se = Factory.openSession();

		Question q = new Question();
		q.setQid(1);
		q.setQname("Features of JAVA ?");
		
		Answer an = new Answer();
		an.setAid(101);
		an.setSolution("Object-oriented");
		an.setQue(q);

		Answer an1 = new Answer();
		an1.setAid(102);
		an1.setSolution("Platform Independent");
		an1.setQue(q);
		

		Answer an2 = new Answer();
		an2.setAid(103);
		an2.setSolution("Robust");
		an2.setQue(q);
		
	
		List<Answer> list=new ArrayList<Answer>();
		 list.add(an);
		 list.add(an1);
		 list.add(an2);
		
		 q.setAn(list);
	
	   Transaction tx= se.beginTransaction();
	   se.save(q);
		se.save(an);
		se.save(an1);
		se.save(an2);		
		
		tx.commit();
		se.close();
		Factory.close();
		}

	}