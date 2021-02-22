package com.uis.test.junit.demos;
import org.junit.*;
 
/**
 * JUnit Expected Exception Test
 * @author vsaranu
 *
 */
public class JunitTest2 {
 
	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	}  
 
}