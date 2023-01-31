package com.Manoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
	
	
	private static Multiplication multiplication=null;
	
	@BeforeAll
	public static void init() {
		
		multiplication=new Multiplication();
	}
	
	@AfterAll
	public static void destroy() {
		
		multiplication=null;
	}

	@Test
	public void mulTest() {
		
		int acutalresult = multiplication.mul(10, 5);
		int expectedresult=50;
		assertEquals(expectedresult, acutalresult);
	}
	
	
	@Test
	public void divTest() {
		
		int acutalresul = multiplication.div(10, 5);
		int expectedresul=2;
		assertEquals(expectedresul, acutalresul);
	}
	
}
