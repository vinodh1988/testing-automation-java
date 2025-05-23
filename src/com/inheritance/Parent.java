package com.inheritance;

public  class Parent {
   
   protected int asset;
   
   public Parent() {
	   System.out.println("Parent constructor");
   }
   public Parent(int asset) {
	   System.out.println("Parent constructor with asset");
	   this.asset = asset;
   }//overloading constructor
   
   public void display() {
	   System.out.println("Parent display");
   }
   
  public void show() {
	   System.out.println("Parent show");
	   System.out.println("Asset: " + asset);
   }
   
   
}
