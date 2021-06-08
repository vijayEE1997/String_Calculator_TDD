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
	public void testSingleNegativesNotAllowed() {
		try {
			sc.add("-1,5,6");			
		}
		catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(),"negatives not allowed : -1");
		}
	}
	@Test
	public void testMultipleNegativesNotAllowed() {
		try {
			sc.add("-1,5,-6");			
		}
		catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(),"negatives not allowed : -1,-6");
		}
	}
	
	@Test
	public void testNumberBiggerThenThousand() {
			assertEquals(11,sc.add("1010,5,6"));
	}
	
	@Test
	public void testAnyLengthDelimitor() {
			assertEquals(6,sc.add("//[***]\n1***2***3"));
	}
	
	@Test
	public void testGetCount_2() {
		assertEquals(9,sc.getCalledCount());
	}

}
