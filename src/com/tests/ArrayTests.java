package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.code.ArrayOps;

public class ArrayTests {
  
	@Test
	public void testSum() {
		int[] arr = {1, 2, 3, 4, 5};
		int expected = 15;
		int actual = ArrayOps.sum(arr);
		assertEquals(expected, actual);
	}
	
	@Test	
	public void testSumUnintialized() {
		int[] arr = new int[5];
		int expected = 0;
		int actual = ArrayOps.sum(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMax() {
		int[] arr = {1, 2, 3, 4, 5};
		int expected = 5;
		int actual = ArrayOps.max(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNegativeMax() {
		int[] arr = {-1, -2, -3, -4, -5};
		int expected = -1;
		int actual = ArrayOps.max(arr);
		assertEquals(expected, actual);
	}
	
}
