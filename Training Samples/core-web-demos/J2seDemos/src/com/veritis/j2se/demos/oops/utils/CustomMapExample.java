package com.veritis.j2se.demos.oops.utils;

import java.util.HashMap;

public class CustomMapExample {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map=new HashMap();
		Emp e1=new Emp(111,"Venkata Saranu","Software");
		Emp e2=new Emp(222,"Kasar","Sr Software ");
		Emp e3=new Emp(333,"Mohan","Software Architect");
		Emp e4=new Emp(444,"Krishna","DBA");
		Task t1=new Task(1111,"design", 30, 0);
		Task t2=new Task(2222,"db design", 30, 0);
		Task t3=new Task(3333,"module developement", 30, 0);
		Task t4=new Task(4444,"Spring integration", 30, 0);
		
		map.put(e1, t4);
		map.put(e2, t3);
		map.put(e3, t1);
		map.put(e4, t2);
		//Task task=(Task)map.get(e1);
		//Emp testEmp=new Emp(111, "Venkata Saranu", "Software");
	//	System.out.println("e1 = "+e1+" ---- testEmp = "+testEmp);
		Task task=(Task)map.get(new Emp(111, "Venkata Saranu", "Software"));
		System.out.println(task);
		
		
		System.out.println(e1);
		System.out.println(new Emp(111,"Venkata Saranu","Software"));
	}

}
