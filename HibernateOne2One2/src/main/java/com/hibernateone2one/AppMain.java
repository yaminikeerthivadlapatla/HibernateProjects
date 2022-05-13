package com.hibernateone2one;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session se = factory.openSession();
		Transaction tx = se.beginTransaction();
		
		/*Product p = new Product();
		p.setProdID(1);
		p.setName("Java Book");
		p.setPrice(100);*/
		
		Product p1 = new Product();
		p1.setProdID(2);
		p1.setName("MySql");
		p1.setPrice(100);
		
		/*Product p2 = new Product();
		p2.setProdID(3);
		p2.setName("Hibernate");
		p2.setPrice(100);
		
		Supplier s = new Supplier();
		s.setSupplierID(106);
		s.setName("Yamini");
		s.setAddress("Eluru");
		s.setPhone(1234);
		p.setSupplierID(s);
		
		Supplier s1 = new Supplier();
		s1.setSupplierID(107);
		s1.setName("Maitrai");
		s1.setAddress("AP");
		s1.setPhone(5678);
		p1.setSupplierID(s1);
		
		Supplier s2 = new Supplier();
		s2.setSupplierID(105);
		s2.setName("Yamini");
		s2.setAddress("Eluru");
		s2.setPhone(1234);
		p2.setSupplierID(s2);
		
		
		se.save(s);
		se.save(s1);
		se.save(s2);
		
		se.save(p);
		se.save(p1);
		se.save(p2);*/
		se.update(p1);
		
		tx.commit();
		se.close();
		factory.close();
	}
}