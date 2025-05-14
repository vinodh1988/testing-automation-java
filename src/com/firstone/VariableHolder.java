package com.firstone;

public class VariableHolder {
  private int state; //instance variable
  private static int shared;  //class variable
  
  public void process() {
	  int temp=30;  //local variable
      shared=50;
      state =12;
  }
  
  public static void common() {
	  
	  System.out.println(shared);
	 // System.out.println(state);
  }
}
