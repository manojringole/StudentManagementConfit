package com.Manoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	private static Calculator calculator=null;
	
	@BeforeAll
	public static void init() {
		
		calculator=new Calculator();
	}
	
	@AfterAll
	public static void destroy() {
		
		calculator=null;
	}
	
	@Test
	public void sumTest() {
		
	//	Calculator  calculator=new Calculator();
		
		int actual = calculator.sum(10, 20);
		
		int expected=30;
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void subTest() {
		
	//	Calculator  calculator=new Calculator();
		
		int actual = calculator.sub(20, 10);
		
		int expected=10;
		
		assertEquals(expected, actual);
	}
	
	
	
	
	
}
