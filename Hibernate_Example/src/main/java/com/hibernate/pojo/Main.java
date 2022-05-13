package com.hibernate.pojo;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory Factory = new Configuration().configure().buildSessionFactory();
		Session se = Factory.openSession();
		
		Emp ep = new Emp();
		ep.setEid(1);
		ep.setEname("Yamini");
		ep.setEsal(350000);
		ep.setEcity("Hyderabad");
			
		Edeg ed = new Edeg();
		ed.setProgram_leader(10);
	    ed.setLname("Yamini");
		ed.setLcourse("Java");
		ed.setTrn(t);

	}

}
