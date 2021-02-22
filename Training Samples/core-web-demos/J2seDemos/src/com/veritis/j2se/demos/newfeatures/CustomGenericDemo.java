package com.veritis.j2se.demos.newfeatures;

import com.veritis.j2se.demos.oops.utils.Task;

public class CustomGenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp e=new Emp(111, "a","b", "AAAA");
		Task t=new Task(1, "pppppp", 6, 2);
		GenericClass<Emp, Task> obj1=new GenericClass<Emp,Task>();
		obj1.setFirstObject(e);
		obj1.setSecondObject(t);
		
		GenericClass<String, String> test=new GenericClass<String ,String>();
		test.setFirstObject("Vem");
		test.setSecondObject("test");
	}

}
