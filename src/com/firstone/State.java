package com.firstone;

public class State {
  public int count;
  public static int scount;
  
  State() {
	   count++;
	   scount++;
  } //constructor is non static context
  
  
  public int getCount() {
	  return count;
  }
  
  public static int getScount() {
	  return scount;
  }
  
}
// in a non static context both static and non static variables can be used
// in a static context only static can be used