package com.veritis.j2se.demos.oops;

public  class BankImpl  implements Bank {

	float amount;
	float duration;
	float intrestrate;
	
	public BankImpl(float amount, float duration, float intrestrate) {
		this.amount = amount;
		this.duration = duration;
		this.intrestrate = intrestrate;
	}

	@Override
	public void deposit(float amt) { //concrete
		amount+=amt;
		System.out.println("Your Amount $"+amt+" got deposited..");
		amount=(amount+calculateINR());
	}

	@Override
	public void withdraw(float amt) {
	 if(amt > amount)
		 System.out.println("Withdrawl is not possible please check your amt");
	 else
	 {
		 amount-=amt;
		 System.out.println("Your Amount $"+amt+" is there in the tray please count before leave..");
	 }
	 
	}

	@Override
	public void viewBalance() {
		System.out.println("Your account Balance is "+amount);

	}
	public float calculateINR(){
		if(duration >= 6 ){
			return (amount*intrestrate);
		}
		else
			return 0;
	}

}
