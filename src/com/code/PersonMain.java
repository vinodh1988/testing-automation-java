package com.code;

import com.firstone.Person;

public class PersonMain {
  public static void main(String[] args) {
	//Person person = new Person(1, "John Doe", "Chennai");

	//System.out.println(person);
	Person person[] = new Person[5]  ;
  //	{null,null,null,null,null}
 
	person[0]=new Person(1, "John Doe", "Chennai"); //object assigned
	person[1]=new Person(2, "Jane Doe", "Mumbai");
	System.out.println(person[0])	;	
}
}
