package com.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator sc = new StringCalculator();
	
	@Test
	public void test() {
		assertEquals(0,sc.add(""));
	}

}
