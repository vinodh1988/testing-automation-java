package com.abstracthings;

public abstract class Shape {
    protected String name;
    protected int sides;
    
    public Shape() {
		this.name = "Unknown";
		this.sides = 0;
	}
    public Shape(String name, int sides) {
		this.name = name;
		this.sides = sides;
	}
    
    public void display() {	
     		System.out.println("Shape: " + name);
     		System.out.println("Sides: " + sides);
    }
    
   abstract public int area();
   abstract public int perimeter();
}  
