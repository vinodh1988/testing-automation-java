package com.code;

import com.inheritance.Parent;

public class Child2 extends Parent {
	
	public Child2() {
		super(); // calls the parent constructor
		System.out.println("Child2 constructor");
	}
	
	public Child2(int asset) {
		super(asset); // calls the parent constructor with asset
		System.out.println("Child2 constructor with asset");
	}
	
	public void childDisplay() {
		System.out.println("Child2 display");
	}
	
	public void show() {
		System.out.println("Child2 show");
		asset = 200; // accessing parent class variable
	}	
	
	

}
