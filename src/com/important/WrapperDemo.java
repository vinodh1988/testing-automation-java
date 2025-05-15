package com.important;

public class WrapperDemo {
    public static void main(String[] args) {
		Integer i = 5;
		
		int a=i; //wrapper type is assignable to primitive type
	             //this is called auto-unboxing
		
		System.out.println("a = " + a);
		
		int[] p = new int[5];
		
		for (int j = 0; j < p.length; j++) {
			System.out.println("p[" + j + "] = " + p[j]);
		}
		
		System.out.println("------------------------------------");
		
		Integer[] arr = new Integer[5];
		for (int j = 0; j < arr.length; j++) {
			System.out.println("arr[" + j + "] = " + arr[j]);
		}
		
		int [] array2 = p;
	  //  int [] array3 = arr;  // autounboxing for arrays is not supported
	  //  Integer []array4 =p; // autoboxing for arrays is not supported
	}
}

//Integer can hold null value
// int cannot hold null;
//primitive type to wrapper type is called auto-boxing
//wrapper type to primitive type is called auto-unboxing