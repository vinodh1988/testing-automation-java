package com.code;

public class MathOperations {
  public static int add(int a, int b) {
	return a + b;
  }
  public static int add(int a, int b, int c) {
	  return a + b + c;
  }
  
  public static float add(float a, float b) {
	  return (a + b);
  }
  
  public static float add(float a, float b, float c) {
	  return a + b + c;
  }
  
  public static float add(int a, float b) {
	  return a + b;
  }
  
  public static float add(float a, int b) {
	  return a + b;
  }
  
  
  
} //overloading

/*
 * 1. Method Overloading: The ability to define multiple methods with the same name 
 * but different parameter lists.
 *   Difference must be created using
 *   * Different number of parameters
 *   * Different types of parameters
 *   * Different order of parameters
 */
