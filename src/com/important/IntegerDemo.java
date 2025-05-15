package com.important;

public class IntegerDemo {
     public static void main(String[] args) {
		Integer i = 5; //integer pool
		Integer j = 5; // integer pool not created
		Integer k = new Integer(5); // new object created - heap memory
		Integer l = new Integer(5); // new object created - heap memory
		
		System.out.println(i == j); //true
		System.out.println(k == l); //false
		System.out.println(i == k); //false
		
		int n = 5; // Uses the literal in integer pool
		System.out.println(k==n); //true
		
		// if you use == operator with one operant primitive
		// and other is wrapper class the wrapper type is converted to primitive
		// this is called auto-unboxing
	}
}

/*
 * when comparing two objects always use equals method
 * when comparing two primitives use == operator
 * when comparing wrapper and primitive use == operator (for string 
 * not applicable)
 * 
 */
