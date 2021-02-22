package com.client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.demos.Address;
import com.veritis.hibernate.demos.Employee;
import com.veritis.hibernate.demos.Person;
import com.veritis.hibernate.demos.UserDetail;
import com.veritis.hibernate.demos.Vehicle;

public class HibernateClient {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
//		Address address=new Address();
//		address.setStreet("1800 E Spring Creek");
//		address.setCity("Plano");
//		address.setState("TX");
//		address.setZip("75074");
//		Person person=new Person();
//		
//		person.setLocation(address);
//		UserDetail userdet=new UserDetail();
//		userdet.setFirstName("Venkata");
//		userdet.setLastName("Saranu");
//		person.setUsername(userdet);
//		//person.setPersonid(111);
//	//	person.setName("Venkata");
//		
//		person.setSsn("123-45-6789");
//		Calendar cal = Calendar.getInstance();
//		cal.set(1982, 6, 25);
//		Date date = cal.getTime();
//		person.setDob(date);
//		person.setGender("Male");
//		person.setPid("");
//		
//		
//		Vehicle v=new Vehicle();
//		v.setVehicleid(111);
//		v.setVehiclename("CR-V");
//		person.getVehicles().add(v);
//		
//		v=new Vehicle();
//		v.setVehicleid(222);
//		v.setVehiclename("BMW");
//		person.getVehicles().add(v);
//		v=new Vehicle();
//		v.setVehicleid(333);
//		v.setVehiclename("Benz");
//		person.getVehicles().add(v);
//		
//		Session session = factory.openSession();
//		session.getTransaction().begin();
//		session.save(person);
//		session.getTransaction().commit();
//		
//		session.close();
		
		Session session=factory.openSession();
//		Person p=(Person)session.get(Person.class,"VSa-6789");
//		s(p.getPid());
//		s(p.getSsn());
//		s(p.getDob()+"");
//		s(p.getGender());
//		s(p.getLocation().getState());
//		s(p.getUsername().getFirstName());
		Employee emp=new Employee();
		emp.setEmpno(222);
		emp.setEmpName("Saranu");
		emp.setDesig("JavaDev");
		emp.setSal(7432.42);
		Calendar cal=Calendar.getInstance();
		cal.set(1982,9, 14);
		emp.setDob(cal.getTime());
		emp.setSsn("123-45-6789");
		
		Vehicle v=new Vehicle();
		v.setVehicleid(1111);
		v.setVehiclename("CR-V");
		emp.getVehicles().add(v);
	
		v=new Vehicle();
		v.setVehicleid(2222);
		v.setVehiclename("BMW");
		emp.getVehicles().add(v);
		
		session.getTransaction().begin();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();
		session.close();
//		Collection<Vehicle> ves=(Collection<Vehicle>)p.getVehicles();
//		System.out.println(ves);
		System.out.println("Emp Record inserted .....");

	}
	
	public static void s(String name){
		System.out.println(name);
	}

}
