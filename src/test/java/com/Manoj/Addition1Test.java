package com.Manoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Addition1Test {
	
     private static Addition1 addition1=null;
     
     @BeforeAll
     public static void init() {
    	 
    	 addition1=new  Addition1();
     }
     
     @AfterAll
     public static void dest() {
    	 
    	 addition1=null;
     }
	
	
	@Test
	public void sumTest() {
		
	//	Addition1 addition1=new Addition1();
		int acutal1 = addition1.sum(10, 20);
		int repected1=30;
		
	   assertEquals(acutal1, repected1);
	}

}
