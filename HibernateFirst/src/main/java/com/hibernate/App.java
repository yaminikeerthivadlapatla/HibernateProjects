package com.hibernate;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		/*Cart item1=new Cart(); 
     	 item1.setId(4);
		 item1.setName("Nisha");
		 item1.setCity("TN");
		 */
		/*Cart item2=new Cart();
		  item2.setId(2);
		  item2.setName("Maitrai");
		  item2.setCity("Vijayawada");
		 */
		// List<Cart> l1=new ArrayList<Cart>();
		// l1.add(item1);
		// l1.add(item2);
		ses.beginTransaction();
		// ses.save(item1);
		// ses.save(item2);
		// ses.delete(item1);
		// ses.update(item1);
		//Cart c = (Cart) ses.get(Cart.class, 4);
		// ses.delete(c);
		// System.out.println("Deleted Successfully");
		//c.setName("Irfana");
		//System.out.println("Updated Successfully");
		//ses.getTransaction().commit();
		//ses.beginTransaction();
		  Query query = ses.createQuery("from Cart");
		  List <Cart> arr = query.list();
		  for(Cart e : arr)
		  {
		System.out.println("id: "+e.getId()+", Name: "+e.getName()+", City: "+e.getCity());
		  }
		  ses.getTransaction().commit();
		 		// tx.commit();
		ses.close();
		factory.close();
	}
}