package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session1=factory.openSession();
		Transaction transaction = session1.beginTransaction();
//		
//		Customer customer = new Customer();
//		customer.setName("mitali");
//		customer.setCity("pune");
//		
//		Customer customer2 = new Customer();
//		customer2.setName("sai");
//		customer2.setCity("Sangli");
//		
//		session1.save(customer);
//		session1.save(customer2);
//		
//		transaction.commit();
	//Using session level cache it a session fires query for one only one time it will bydefault open for the same
//	Customer customer3=session1.get(Customer.class, 1);
//	System.out.println(customer3.getId() + "  "+customer3.getName()+" "+ customer3.getCity());
//	
//	Customer customer4 = session1.load(Customer.class, 2);
//	System.out.println(customer4.getId() + "  "+customer4.getName()+" "+ customer4.getCity());
//
//	Customer customer1 =(Customer)session1.get(Customer.class, 1);
//	System.out.println(customer1.getId() + "  "+customer1.getName()+" "+ customer1.getCity());
//	session1.close();

	System.out.println();
	System.out.println("session factory>>>>> Always hits to database");
	Session session = factory.openSession();
	Customer customer5=session.get(Customer.class, 1);
	System.out.println(customer5.getId() + "  "+customer5.getName()+" "+ customer5.getCity());
	
	Session session2 = factory.openSession();
	Customer customer6=session2.get(Customer.class, 1);
	System.out.println(customer6.getId() + "  "+customer6.getName()+" "+ customer6.getCity());
	
	
	
	
		
		
	}

}
