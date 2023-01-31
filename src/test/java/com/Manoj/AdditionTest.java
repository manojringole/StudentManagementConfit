package com.Manoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdditionTest {
	
	private static Addition add=null; //byler plate code remove
	
	@BeforeAll
	public static void init() {
		
		add=new Addition();
	}
	
	@AfterAll
	public static void destroy() {
		
		add=null;
	}
	
	

	@Test
	public void sumTest() {
		
	//	Addition addition =new Addition();
		
		int actualresule = add.sum(10, 20);
		
		int expectedresult=30;
		
		assertEquals(expectedresult, actualresule);
	}
	
	
	@Test
	public void subTest() {
		
	//	Addition substraction =new Addition();
		
		int actual = add.sub(20, 10);
		
		int expected=10;
		
		assertEquals(expected, actual);
	}
	
}
