package com.code;

import com.abstracthings.Rectangle;
import com.abstracthings.Shape;
import com.abstracthings.Square;

public class ShapeOperation {

	public static void main(String[] args) {
		Shape shape ; //reference variable of type Shape
		
		shape = new Rectangle("Rectangle", 4, 15, 6);
		
		shape.display(); //Rectangle class method
		System.out.println("Area:"+shape.area()); //Rectangle class method
		System.out.println("Perimeter:"+shape.perimeter());//Rectangle class method
		
		shape = new Square("Square", 4, 5);
		
		shape.display(); //Square class method
		System.out.println("Area:"+shape.area()); //Square class method
		System.out.println("Perimeter:"+shape.perimeter());//Square class method
		
		
	}
}
