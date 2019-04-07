package com.veritis.j2se.demos.oops;

public class Sample {
	protected int a,b;
	public void getData(){
		a=20;
		b=30;
	}
	public void show(){
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("A+B value is "+(a+b));
	}
	@Override
	public String toString() {
		return "We are in sample to String";
	}
}
