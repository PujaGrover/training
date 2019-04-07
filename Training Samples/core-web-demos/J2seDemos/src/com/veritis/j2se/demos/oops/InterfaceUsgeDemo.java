package com.veritis.j2se.demos.oops;

public class InterfaceUsgeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank=new BankObjectCreation().getBank();
		bank.deposit(1000);
		bank.withdraw(10000);
		bank.withdraw(3000);
		bank.viewBalance();
		
	}

}
