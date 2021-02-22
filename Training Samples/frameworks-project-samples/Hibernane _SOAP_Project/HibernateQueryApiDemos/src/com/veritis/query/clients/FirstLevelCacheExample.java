package com.veritis.query.clients;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.query.api.Product;

public class FirstLevelCacheExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Product product=(Product) session.get(Product.class, 5);
		System.out.println(product.getName());
		product.setName("Sony 3D Smart TV");
		session.saveOrUpdate(product);
		
		Product product1=(Product) session.get(Product.class, 5);
		System.out.println(product1.getName());
		
		session.getTransaction().commit();
		session.close();
		
		Session session1=factory.openSession();
		session1.beginTransaction();
		Product product3=(Product) session1.get(Product.class, 5);
		session1.getTransaction().commit();
		session1.close();
	}

}
