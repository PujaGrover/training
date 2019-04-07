package com.client;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.demos.Employee;
import com.veritis.hibernate.demos.Vehicle;

public class GetClient {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Employee e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		session.close();
		session=factory.openSession();
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		e=(Employee) session.load(Employee.class, 222);
		System.out.println(e);
		
//		System.out.println(e);
//		session.close();
//		Set<Vehicle> vs=e.getVehicles();
//		for(Vehicle v:vs){
//			System.out.println(v);
//		}
		
	}

}
