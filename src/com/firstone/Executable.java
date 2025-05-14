package com.firstone;

public class Executable {
   public static void main(String[] args) {
	 
	 System.out.println("First Program");
	 Person p = new Person();//default constructor will not create if you have any other form of constructor
	 Person p1= new Person(2,"Rohan","Chennai");
	 Person p2= new Person(3,"James","Mumbai");
	 p.display();
	 p1.display();
	 p2.display();
	// p.sno=1;p.name="Aadhi"; //wrong practice
	 p.setSno(1);
	 p.setName("Aadhi");
	 System.out.println("---------------------------");
	 p.display();
	 p1.display();
	 p2.display();
	 
	 System.out.println(p1.getName());
	 System.out.println(Person.getCount());
	
	 // p is reference variable;
	 //new Person() -- object creation
  }
}
