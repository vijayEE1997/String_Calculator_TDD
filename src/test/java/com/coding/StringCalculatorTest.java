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
	public void testTwoNumber() {
		assertEquals(3,sc.add("1,2"));
	}
	
	@Test
	public void testThreeNumber() {
		assertEquals(8,sc.add("1,2,5"));
	}

	@Test
	public void testNewLine() {
		assertEquals(8,sc.add("1\n2,5"));
	}
	
	@Test
	public void testdifferentDelimiter() {
		assertEquals(11,sc.add("//;\n2;9"));
	}
	
	@Test
	public void testNegativesNotAllowed() {
		try {
			sc.add("-1,5,6");			
		}
		catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(),"negatives not allowed : "+"-1");
		}
	}

}
