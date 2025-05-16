package com.important;

import com.firstone.Person;

public class HashCodeDemo {
   public static void main(String[] args) {
	 Person p1 = new Person(1,"Ram", "Chennai"); //For user defined class if you print
	                                            //the object it will print the hashcode of the object
	 Person p2 = new Person(1,"Ram", "Chennai");
	 Integer i1 = 5;
	 Integer i2 = 6;
	 Integer i3 = new Integer(5);
	 String str1 = "Ram";
	 String str2 =  new String("Ram");
	 String str3 = "Rohan";
	 
	 System.out.printf("\n Hashcode : %x and value of p1: %s " , p1.hashCode(),p1);
 	 System.out.printf("\n Hashcode : %x and value of p2: %s " , p2.hashCode(),p2);
     System.out.printf("\n Hashcode : %x and value of i1 : %d " , i1.hashCode() ,i1);			 
     System.out.printf("\n Hashcode : %x  and value of i2: %d " , i2.hashCode(),i2);
     System.out.printf("\n Hashcode : %x and value of i3: %d " , i3.hashCode(),i3);
     System.out.printf("\n Hashcode : %x and value of str1: %s" , str1.hashCode(),str1);
     System.out.printf("\n Hashcode : %x and value of str2: %s" , str2.hashCode(),str2);
     System.out.printf("\n Hashcode: %x and value of str3: %s " , str3.hashCode(),str3);
     
 }
}

// to compare hashcode of two objects we use equals method