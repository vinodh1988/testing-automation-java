package com.code;

import com.inheritance.Child;

public class InheritHub {
  public static void main(String[] args) {
	Child child = new Child(78);
	child.display(); //parent class method
	child.childDisplay();
	child.show(); //overridden method
	              //child copy called parent copy is over shadowed.
	 //accessing parent class variable
  }
}
