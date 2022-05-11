package com.hibernate.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.pojo.Learner1;
import com.hibernate.pojo.Trainer1;
import com.hibernate.util.HibernateUtil;

public class MainOne2Many {
	public static void main(String[] args) {

		SessionFactory Factory = HibernateUtil.getInstnce();
		Session se = Factory.openSession();
		
		/*Trainer1 t = new Trainer1();
		t.setTid(101);
		t.setTname("Pooja");
		t.setTsubject("JAVA");

		Learner1 l = new Learner1();
		l.setLid(10);
		l.setLname("Yamini");
		l.setLcourse("Java");
		l.setTrn(t);
		
		Learner1 l1 = new Learner1();
		l1.setLid(11);
		l1.setLname("Maitrai");
		l1.setLcourse("Java");
		l1.setTrn(t);
		
		Learner1 l2 = new Learner1();
		l2.setLid(12);
		l2.setLname("Irfana");
		l2.setLcourse("Java");
		l2.setTrn(t);
		
		Learner1 l3 = new Learner1();
		l3.setLid(13);
		l3.setLname("Kader");
		l3.setLcourse("Java");
		l3.setTrn(t);*/
		
		/*List<Learner1> list=new ArrayList<Learner1>();
	       list.add(l);
		 list.add(l1);
         list.add(l2);
		 list.add(l3);
		 t.setLn(list);*/

		Transaction tx = se.beginTransaction();
		/*se.save(t);
		se.save(l);
		se.save(l1);
		se.save(l2);
		se.save(l3);*/
		Query query = se.createQuery("Select count(Lid) from Learner1");
		Iterator count = query.iterate();
		System.out.println("No.of rows :"+count.next());
		
		Query query1 = se.createQuery("Select max(lid) from Learner1");
		Iterator count1 = query1.iterate();
		System.out.println("Maximum id: "+count1.next());
		
		Query query2 = se.createQuery("Select min(lid) from Learner1");
		Iterator count2 = query2.iterate();
		System.out.println("Minimum id :"+count2.next());
		
		Query query3 = se.createQuery("Select sum(Lid) from Learner1");
		Iterator count3 = query3.iterate();
		System.out.println("Sum :"+count3.next());
		
		Query query4 = se.createQuery("Select avg(Lid) from Learner1");
		Iterator count4 = query4.iterate();
		System.out.println("No.of rows :"+count4.next());
		
		/*Query query4 = se.createQuery("from Learner1");
		List<Learner1> list = query4.list();
		for(Learner1 lrn:list)
		{
			System.out.println("lid:" + lrn.getLid() + "lname:" + lrn.getLname() + "lcourse:" + lrn.getLcourse());
		}*/
		
		
		tx.commit();
		se.close();
		Factory.close();
		}

}
