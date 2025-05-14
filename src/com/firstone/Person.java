package com.firstone;
/**
 * 
 * Person Entity with sno,name and city
 */
public class Person {
  private int sno; //instance variable
  private String name;
  private String city; 
  private static  int objectCount;// properties or instance variables
  public Person(){
	   objectCount++;
   }
   
  public  Person(int sno ,String name,String city) { //sno,name,city are local variables
	   this.sno=sno;
	   this.name=name;
	   this.city=city;
	   objectCount++;
   }
  /**
   *  Shows sno,name and city
   */
   public void display() {
	   System.out.println("Sno:"+sno);
	   System.out.println("Name:"+name);
	   System.out.println("City:"+city);
	   
   }   //methods or instance methods or member methods/member functions

   public static int getCount() {
	   return objectCount;
   }
public int getSno() {
	return sno;
}

public void setSno(int sno) {

	this.sno = sno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
   
   
}
