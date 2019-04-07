package com.veritis.j2se.demos.oops.inheritancedemos;

public  class SuperClass {
	int a,b;
	
//	public SuperClass() {
//		a=10;
//		b=20;
//	}
	public SuperClass(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
	public int add(){
		return(a+b);
	}
	public void dispAdd(){
		System.out.println("a+b = "+add());
	}
	
}
