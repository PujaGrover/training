package com.veritis.j2se.demos.oops;

public class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("We are drawing rectangle");
	}
	public int area(){
		System.out.println("we are finding the area of rectangle");
		return 0;
	}

}
