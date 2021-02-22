package com.uis.test.junit.demos;
import org.junit.*;
 
/**
 * JUnit TimeOut Test
 * @author Venkata Saranu
 *
 */
public class JunitTest4 {
 
	@Test(timeout = 2000)  
	public void infinity() {  
		try{
			Thread.sleep(1500);
			System.out.println("Slept for 1.5 sec");
		}catch(Exception e){
			
		}
	}  
 
}