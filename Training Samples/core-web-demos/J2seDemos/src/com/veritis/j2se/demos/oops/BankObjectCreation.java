package com.veritis.j2se.demos.oops;

public class BankObjectCreation {
public Bank getBank(){
	Bank b=new BankImpl(5000,7,0.15f);
	return b;
}
}
