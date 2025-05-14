package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.code.SimpleMath;

public class SimpleMathTest {
  
	@Test
	public void testAdd() {
	 assertEquals(SimpleMath.add(2, 3), 5);	
	}
	
	@Test
	public void testMul() {
	 assertEquals(SimpleMath.multiply(2, 3), 6);	
	}
	
	@Test
	public void testLength() {
     assertEquals(SimpleMath.size("india"), 5);
	}
}
