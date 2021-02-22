package com.uis.test.junit.demos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class MathTest extends TestCase {

	private int value1;
	private int value2;
	Calculation calculation;
	public MathTest(String testName) {
		super(testName);
	}
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		calculation=new Calculation();
		value1 = 3;
		value2 = 5;
		
	}
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		value1 = 0;
		value2 = 0;
		calculation=null;
	}
	@Test
	public void testAdd() {
		int total = 8;
		int sum = calculation.add(value1, value2);
		assertEquals(sum, total);
	}
	@Test
	public void testFailedAdd() {
		int total = 9;
		int sum = calculation.add(value1, value2);
		assertNotSame(sum, total);
	}
	@Test
	public void testSub() {
		int total = 0;
		int sub = calculation.sub(4, 4);
		assertEquals(sub, total);
	}

}