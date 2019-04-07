package com.veritis.j2se.demos.newfeatures;

public class CurrencyUsage {

	public static void main(String[] args) {
		int cents=10;
		
		if(Currency.DIME.getValue()==cents){
			System.out.println("Its a "+Currency.DIME.name());
		}

	}

}
