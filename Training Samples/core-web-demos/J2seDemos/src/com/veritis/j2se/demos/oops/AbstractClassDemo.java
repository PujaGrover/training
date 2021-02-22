package com.veritis.j2se.demos.oops;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Shape triangle=new Triangle();
		Shape rectangle=new Rectangle();
		triangle.display();
		triangle.draw();
		rectangle.display();
		rectangle.draw();
	}

}
