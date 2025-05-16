package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.code.MathOperations;

public class AddTests {
	 @Test
	 public void testAdd() {
		 int result = MathOperations.add(2, 3);
		 assertEquals(5, result);
	 }
	 
	 @Test
	 public void testAddThreeNumbers() {
		 int result = MathOperations.add(2, 3, 4);
		 assertEquals(9, result);
	 }
	 
	 @Test
	 public void testAddTwoFloats() {
		 float result = MathOperations.add(2.5f, 3.5f);
		 assertEquals(6.0f, result);
	 }

	 @Test
	 public void testAddThreeFloats() {
		 float result = MathOperations.add(2.5f, 3.5f, 4.5f);
		 assertEquals(10.5f, result);
	 }
	 
	 @Test void testAddIntAndFloat() {
		 float result = MathOperations.add(2, 3.5f);
		 assertEquals(5.5f, result);
	 }
	
	 @Test void testAddFloatAndInt() {
		 float result = MathOperations.add(2.5f, 3);
		 assertEquals(5.5f, result);
	 }
}
