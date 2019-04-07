package com.veritis.log4j.demo;

import org.apache.log4j.Logger;

public class FindFactorial {
	final static Logger logger = Logger.getLogger(FindFactorial.class);
	public int factorial(int n) {
		logger.debug("Entered into findFactorial for the number "+n);
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		logger.debug("Got the result of factorial of :"+n+" =  "+fact);
		return fact;
	}
}
