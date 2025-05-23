package com.abstracthings;

public class Square extends Shape {
 
	private int side;
	
	public Square() {
		super();
		this.side = 0;
	}
	
	public Square(String name, int sides, int side) {
		super(name, sides);
		this.side = side;
	}
	
	@Override
	public int area() {
		return side * side;
	}
	
	@Override
	public int perimeter() {
		return 4 * side;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Side: " + side);
	}
}
