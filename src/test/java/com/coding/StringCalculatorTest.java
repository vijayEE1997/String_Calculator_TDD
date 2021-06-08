package com.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator sc = new StringCalculator();
	
	@Test
	public void testEmptyString() {
		assertEquals(0,sc.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1,sc.add("1"));
	}
	
	@Test
	public void testTwoString() {
		assertEquals(3,sc.add("1,2"));
	}

}
