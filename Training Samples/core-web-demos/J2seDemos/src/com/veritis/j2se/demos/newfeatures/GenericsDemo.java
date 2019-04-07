package com.veritis.j2se.demos.newfeatures;

import java.util.ArrayList;
import java.util.List;

import com.veritis.j2se.demos.oops.utils.Task;

public class GenericsDemo {
	
	public static void main(String args[]){
		
		Emp e1=new Emp(111,"Venkata"," Saranu","Software");
		Emp e2=new Emp(222,"Kasar","prabath","Sr Software ");
		Emp e3=new Emp(333,"Mohan","saranu","Software Architect");
		Emp e4=new Emp(444,"Krishna","Mohan","DBA");
		Task t1=new Task(1111,"design", 30, 0);
		
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		//list.add(t1);
		for(Emp e:list){
			System.out.println(e);
		}
		
		Person p=new Emp();
		// Sub Typing
		List<Emp> list1=new ArrayList<Emp>();
		
		ArrayList<Number> list2=new ArrayList<>();
		
		list2.add(10);
		list2.add(20.35);
		list2.add(2.3443432f);
		list2.add(1023232L);
		//list2.add("Venkata");
		
	}

}
