package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.demos.Employee;

public class DeleteClient {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.getTransaction().begin();
		Employee e=new Employee();
		e.setEmpno(222);
		session.delete(e);
		session.getTransaction().commit();

	}

}
