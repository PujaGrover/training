package com.uis.test.junit.demos;
import org.junit.*;
 
/**
 * JUnit Ignore Test
 * @author Venkata Saranu
 *
 */
public class JunitTest3 {
 
	@Ignore("Not Ready to Run")  
	@Test
	public void divisionWithException() {  
	  System.out.println("Method is not ready yet");
	}  
 
}