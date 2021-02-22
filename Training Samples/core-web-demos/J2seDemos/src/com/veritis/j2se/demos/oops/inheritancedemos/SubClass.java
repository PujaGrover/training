package com.veritis.j2se.demos.oops.inheritancedemos;

public class SubClass extends SuperClass {
	int c; // class memeber 
	public SubClass() {
		super(10,20);
	}
	public SubClass(int c) {
		super(434,353);
		this.c = c;
	}
	
	
	public SubClass(int a, int b, int c) {
		super(a,b);
		//this.c=c;
		//super(a,b);
		this.c=c;
		
		
	}
	public int add(){
		return super.add()+c;
	}
	
}
