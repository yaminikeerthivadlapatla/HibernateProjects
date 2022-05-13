package com.hibernate.namedquery;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session se = factory.openSession();
	
		/* Em e1=new Em(); 
     	 e1.setEid(1);
		 e1.setEname("maitrai");
		 e1.setEcity("Hyderabad");
				 
		 Em e2=new Em(); 
     	 e2.setEid(2);
		 e2.setEname("yamini");
		 e2.setEcity("Banglore");
		 
		 List<Em> l1=new ArrayList<Em>();
			l1.add(e1);
		    l1.add(e2);
		 
		    Transaction tx = se.beginTransaction();
		    se.save(e1);
			se.save(e2);*/
	
	Query query=se.getNamedQuery("findemByID");
	query.setInteger("eid", 1);
	List<Em> list=query.list();
	for(int i=0; i<list.size(); i++) {
		System.out.println("Name:"+list.get(i).getEname());
		}
	        	System.out.println(">>>>>"+list.size());
	        	if(!list.isEmpty()) {
	        		Em e=(Em) list.get(0);
	        		System.out.println(e);
	        		} 
		 
			//tx.commit();
			se.close();
			factory.close();
		}
}