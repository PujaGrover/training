package com.veritis.j2se.demos.oops;

public class Consturctors {
	int a,b,c;
	String str;
	
	public Consturctors() {  // default constructor
		a=10;
		b=20;
		c=30;
		str="Hello";
	}

	public Consturctors(int a, int b, int c, String str) {  // parameterized Constuctor
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.str = str;
	}

	public Consturctors(int a) {
		
		this.a = a;
		b=200;
		c=400;
		str="Java";
	}

	public Consturctors(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		str="World";
	}
	
	public String toString(){
		return "a = "+a+"\nb = "+b+"\nc ="+c+"\nstr = "+str;
	}
	
}
