package com.important;

public class MoreDemo {
    public static void main(String[] args) {
		String str = "Ram";
		
		String str2 = "Ram";
		
		String str3 = new String("Ram");
		
		String str4 = new String("Ram");
		
		System.out.println(str == str2); 
		System.out.println(str3 == str4);
		System.out.println(str ==str3);
		
		System.out.println(str.equals(str2)); //true
		System.out.println(str3.equals(str4)); //true
		System.out.println(str.equals(str3)); //true
	
	}
}

/**
 * 
 *   ==  primitives it compares the value
 *   ==  reference types it compares the reference(address) of the object
 *   
 *   Integer i=5;
 *   Integer j=5;
 *   System.out.println(i==j); //not same as  int i=5; int j=5; i==j;
 *   
 *   Every object when create they get hashcode
 *   hashcode is the address of the object
 *   for wrapper classess if values are same their hashcode is also same
 *   
 *  
 */
