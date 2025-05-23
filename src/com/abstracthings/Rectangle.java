package com.abstracthings;

public class Rectangle extends Shape {
	private int length;
	private int breadth;

	
	public Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(String name, int sides, int length, int breadth) {
		super(name, sides);
		this.length = length;
		this.breadth = breadth;
	}
  
    
	@Override
	public int area() {
		// TODO Auto-generated method stub
	    		return length * breadth;
	}

	@Override
	public int perimeter() {
	    return 2 * (length + breadth);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}
} 
