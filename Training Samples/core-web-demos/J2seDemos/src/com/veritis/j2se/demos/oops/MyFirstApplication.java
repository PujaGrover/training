package com.veritis.j2se.demos.oops;

public class MyFirstApplication {

	
	public static void main(String[] args) {
		System.out.println("Welcome to the world of Java");
		
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
