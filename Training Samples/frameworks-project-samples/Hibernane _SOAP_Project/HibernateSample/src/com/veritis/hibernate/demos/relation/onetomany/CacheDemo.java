package com.veritis.hibernate.demos.relation.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CacheDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		UserDetails user=(UserDetails)session.get(UserDetails.class, 1111);
		
		UserDetails user2=(UserDetails)session.get(UserDetails.class, 1111);
		session.getTransaction().commit();
		session.close();
		
		Session session2=factory.openSession();
		session2.beginTransaction();
		UserDetails user1=(UserDetails)session2.get(UserDetails.class, 1111);
		
		UserDetails user3=(UserDetails)session2.get(UserDetails.class, 1111);
		session2.getTransaction().commit();
		session2.close();
		factory.close();
		factory=new Configuration().configure().buildSessionFactory();
		Session session3=factory.openSession();
		session3.beginTransaction();
		UserDetails user4=(UserDetails)session3.get(UserDetails.class, 1111);
		
		UserDetails user5=(UserDetails)session3.get(UserDetails.class, 1111);
		session3.getTransaction().commit();
		session3.close();
		
	}

}
