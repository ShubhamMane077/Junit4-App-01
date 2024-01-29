package com.nt.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nt.beans.Calculator;

public class CalculatorTest {

	private static Calculator calc = null;

	@BeforeClass
	public static void beforeAll() {
		calc = new Calculator();
	}

	@AfterClass
	public static void afterAll() {
		calc = null;
	}

	@Test
	public void testAdd() {
		Integer actualResult = calc.add(10, 40);
		Integer expectedResult = 50;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMultiplication() {
		Integer actualResult = calc.multiply(10, 30);
		Integer expectedResult = 300;
		assertEquals(expectedResult, actualResult);
	}
}
