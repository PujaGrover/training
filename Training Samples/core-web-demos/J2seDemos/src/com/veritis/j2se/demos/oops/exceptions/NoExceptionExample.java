package com.veritis.j2se.demos.oops.exceptions;

public class NoExceptionExample {

	public static void main(String[] args) {
		System.out.println("we are learning abt exception handling");
		int a =10;
		int b=0;
		try{
		System.out.println("the division is "+(a/b));
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		System.out.println("We have learnt exceptions :) ");
		System.out.println("Have a nice day");

	}

}
