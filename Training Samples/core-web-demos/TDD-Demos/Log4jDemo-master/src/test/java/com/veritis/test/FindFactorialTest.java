package com.veritis.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.veritis.log4j.demo.FindFactorial;

public class FindFactorialTest {
	FindFactorial factorial;
	
	@Before
	public void init(){
		factorial=new FindFactorial();
	}

	@Test
	public void testFact() {
		int result=factorial.factorial(5);
		assertEquals(125, result);
	}

}
