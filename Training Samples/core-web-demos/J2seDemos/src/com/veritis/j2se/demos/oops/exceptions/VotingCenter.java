package com.veritis.j2se.demos.oops.exceptions;

import java.util.Scanner;

public class VotingCenter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		
		
		Validation validation=new Validation();
		boolean valid=false;
		try {
			valid=validation.validateEligibility(age);
		} catch (IllegalVoteCasteException e) {
			System.out.println(e);
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		if(valid){
			System.out.println("Please give me your ssn :P");
		}
	}

}
