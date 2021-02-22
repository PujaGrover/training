package com.veritis.j2se.demos.oops.exceptions;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		//int a=10,b=0;
		int a,b;
		System.out.println("Welcome to Java Exceptions");
		
		System.out.println("We are about to find a/b");
		do{
		System.out.println("Enter a value");
		Scanner scan=new Scanner(System.in);
		 a=scan.nextInt();
		System.out.println("Enter b value");
		b=scan.nextInt();
		try{
		System.out.println(a/b);
		
		}catch(ArithmeticException e){
			System.out.println("Division with Zero is not possible ... Please change the value of b and run again");
		}
		
		}while(b==0);
		System.out.println("After exceution of a/b");
		System.out.println("Good Bye");
	}
}
