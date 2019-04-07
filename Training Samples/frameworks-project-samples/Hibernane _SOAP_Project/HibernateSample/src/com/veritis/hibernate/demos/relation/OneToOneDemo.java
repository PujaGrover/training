package com.veritis.hibernate.demos.relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
//		UserDetails user=new UserDetails();
//		user.setUserid(1111);
//		user.setUserName("Venkata");
//		
//		Vehicle veh=new Vehicle();
//		veh.setVechicleName("CR-V");
//		veh.setVehicleid(100);
//		user.setVechicle(veh);
//		
//		session.getTransaction().begin();
//		session.persist(user);
//		//session.save(veh);
//		session.getTransaction().commit();
//		
		
		UserDetails user=(UserDetails)session.get(UserDetails.class, 1111);
		user=(UserDetails)session.get(UserDetails.class, 1111);
		user=(UserDetails)session.get(UserDetails.class, 1111);
		user=(UserDetails)session.get(UserDetails.class, 1111);
		session.close();
		session=factory.openSession();
		user=(UserDetails)session.get(UserDetails.class, 1111);
		System.out.println(user.getUserid());
		System.out.println(user.getUserName());
		Vehicle vehicle=user.getVechicle();
		System.out.println(vehicle.getVechicleName());
		System.out.println(vehicle.getVehicleid());
	}

}
