package com.inheritance;

public class Child extends Parent{
  private int assetc;
  
  public Child() {
	System.out.println("Child constructor");
  }
  public Child(int assetc) {
	  super(assetc+100);
	  System.out.println("Child constructor with asset");
	  this.assetc = assetc;
  }
  public void childDisplay() {
	  System.out.println("Child display");
	 
  }
  //same method with same signature defined in child class
  //this is called method overriding
  public void show() {
	  super.show();
	  System.out.println("Child show");
	  System.out.println("Asset: " + assetc);
  }
}
