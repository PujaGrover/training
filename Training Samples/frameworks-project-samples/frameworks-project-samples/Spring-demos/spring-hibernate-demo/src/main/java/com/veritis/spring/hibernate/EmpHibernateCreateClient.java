package com.veritis.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpHibernateCreateClient {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		   Emp emp=new Emp();
	       emp.setEmpno(new Integer(1212));
	       emp.setName("Chandu");
	       emp.setDesig("java dev");
	       emp.setSalary(5000.0);
	       
	       session.beginTransaction().begin();
	       session.save(emp);
	       session.beginTransaction().commit();

	}

}
