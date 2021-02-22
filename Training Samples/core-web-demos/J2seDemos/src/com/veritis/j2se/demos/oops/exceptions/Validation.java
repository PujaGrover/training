package com.veritis.j2se.demos.oops.exceptions;

public class Validation {

	public boolean validateEligibility(int age) throws IllegalVoteCasteException{
		boolean eligible=false;
		
		if(age < 18){
			throw new IllegalVoteCasteException(age," Please go back to school .... :) ");
		}else{
			eligible = true;
		}
		return eligible;
	}
}
