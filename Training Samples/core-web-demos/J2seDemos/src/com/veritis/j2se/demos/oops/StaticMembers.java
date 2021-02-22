package com.veritis.j2se.demos.oops;

public class StaticMembers {

	public static int count;
	public StaticMembers(){ //Constructors
		count++;
	}
//	public static void dispCount(){
//		System.out.println("No of Objects created are "+count);
//	}
	public void display(){
		System.out.println("Just counting "+count);
	}
}
