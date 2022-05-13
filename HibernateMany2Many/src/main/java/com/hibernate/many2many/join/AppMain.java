package com.hibernate.many2many.join;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session se = factory.openSession();

		Project2 p1 = new Project2();
		p1.setP_Id(1);
		p1.setP_Title("finance");

		Project2 p2 = new Project2();
		p2.setP_Id(2);
		p2.setP_Title("management");

		Employee2 e1 = new Employee2();
		e1.setEid(11);
		e1.setEname("yamini");

		Employee2 e2 = new Employee2();
		e2.setEid(12);
		e2.setEname("keerthi");

		List<Employee2> list1 = new ArrayList<Employee2>();
		List<Project2> list2 = new ArrayList<Project2>();
		list1.add(e1);
		list1.add(e2);

		list2.add(p1);
		list2.add(p2);
		e1.setProj(list2);

		p2.setEmp(list1);

		Transaction tx = se.beginTransaction();
		se.save(e1);
		se.save(e2);
		se.save(p1);

		se.save(p2);
		tx.commit();
		se.close();
		factory.close();
	}

}

