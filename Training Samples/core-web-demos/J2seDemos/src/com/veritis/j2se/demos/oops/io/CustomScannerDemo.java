package com.veritis.j2se.demos.oops.io;

public class CustomScannerDemo {

	public static void main(String[] args) {
		SageitScanner scan=new SageitScanner(System.in);
		System.out.println("Enter any Integer");
		int k=scan.nextInt();
		System.out.println("Enter Boolean ");
		boolean b=scan.nextBoolean();
		System.out.println("k + 20 = "+(k+20));
		if(b){
			System.out.println("we got b as true");
		}else{
			System.out.println("we got b as false");
		}

	}

}
