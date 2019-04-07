package com.veritis.j2se.demos.oops.exceptions;

public class DivisionFinder{
	public float findDivision(int a, int b) throws Exception {
		float f=0.0f;
		try{
		f=(a / (float) b);
		}catch(ArithmeticException e){
			throw(e);
		}
		return f;
	}
}
