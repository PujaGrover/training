package com.veritis.j2se.demos.oops;

public class ConstructorOverloadDemo {

	public static void main(String args[]){
		Consturctors obj1=new Consturctors();
		System.out.println("Default Constructor");
		System.out.println(obj1);
		System.out.println("Parameterized Constructor");
		Consturctors obj2=new Consturctors(1000, 2000, 3000);
		System.out.println(obj2);
		System.out.println("Fully Parameterized Cons");
		Consturctors obj3=new Consturctors(34, 23, 45, "Welcome to Constructors");
		System.out.println(obj3);
	}
}

