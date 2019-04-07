package com.veritis.jaxws.bottomup.demo;

public class CurrencyService {
	
	public String converDollarINR(int dollars){
		return "For Your Amount $"+dollars+" you will get Rs."+(dollars*53.16);
	}
	
	public String converDollarNPR(int dollars){
		return "For Your Amount $"+dollars+" you will get Nepali Rs."+(dollars*106.16);
	}
}
