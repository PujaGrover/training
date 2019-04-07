package com.veritis.hibernate.demos.relation.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {

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
//		Vehicle veh1=new Vehicle();
//		veh1.setVechicleName("CR-V");
//		veh1.setVehicleid(100);
//		
//		user.getListOfVechicles().add(veh1);
//		
//		Vehicle veh2=new Vehicle();
//		veh2.setVechicleName("BMW -M5");
//		veh2.setVehicleid(101);
//		user.getListOfVechicles().add(veh2);
//		veh1.setUserdetail(user);
//		veh2.setUserdetail(user);
//		session.getTransaction().begin();
//		// What if we comment the following it will throw exception for that solution is casecade 
//		//session.save(veh1);
//		//session.save(veh2);
//	
//		session.persist(user);
//		session.getTransaction().commit();
//		
		Vehicle vehicle=(Vehicle)session.get(Vehicle.class, 100);
		System.out.println("For Vehicle "+vehicle.getVechicleName()+" The owner is ");
		//session.close();
		UserDetails user=vehicle.getUserdetail();
		System.out.println(user.getUserid());
		System.out.println(user.getUserName());
		
		
		UserDetails userDetails = (UserDetails) session.get(UserDetails.class, 1111);
		System.out.println(userDetails.getUserName() +" has "+userDetails.getListOfVechicles().size()+" no of vehicles");
		for(Vehicle v:userDetails.getListOfVechicles()){
			System.out.println(v.getVechicleName()+" with plate no : "+v.getVehicleid());
		}
		
		session.close();
	}

}
