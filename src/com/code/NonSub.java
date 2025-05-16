package com.code;

import com.inheritance.Child;

public class NonSub {
	
	public void dummy() {
		Child child = new Child(78);
		//child.asset = 100; // accessing parent class variable
	}

}
