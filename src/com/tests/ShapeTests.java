package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.abstracthings.Rectangle;
import com.abstracthings.Shape;
import com.abstracthings.Square;

public class ShapeTests {
   private Shape shape[]=new Shape[5]; //array of five shape references

 
   
    public void setShape(String type) {
    			switch(type) {
    			case "Rectangle":
    		
					shape[0] = new Rectangle("Rectangle",4,15,60);
					shape[1] = new Rectangle("Rectangle",4,5,10);
					shape[2] = new Rectangle("Rectangle",4,6,6);
					shape[3] = new Rectangle("Rectangle",4,3,4);
					shape[4] = new Rectangle("Rectangle",4,15,4);
					break;
    			case "Square":
                   shape[0] = new Square("Square",4,15);
                   shape[1] = new Square("Square",4,5);
                   shape[2] = new Square("Square",4,6);
                   shape[3] = new Square("Square",4,3);
                   shape[4] = new Square("Square",4,25);
    			}
    	
    }

    @Test
	public void testArea() {
		
		setShape("Rectangle");
		assertEquals(shape[0].area(), 900);
		assertEquals(shape[1].area(), 50);
		assertEquals(shape[2].area(), 36);
		assertEquals(shape[3].area(), 12);
		assertEquals(shape[4].area(), 60);
    	
		setShape("Square");
		assertEquals(shape[0].area(), 225);
		assertEquals(shape[1].area(), 25);
		assertEquals(shape[2].area(), 36);
		assertEquals(shape[3].area(), 9);
		assertEquals(shape[4].area(), 625);
		
    	
	}
    
    @Test
    public void testPerimeter() {
        		setShape("Rectangle");
        		assertEquals(shape[0].perimeter(), 150);
        		assertEquals(shape[1].perimeter(), 30);
        		assertEquals(shape[2].perimeter(), 24);
        		assertEquals(shape[3].perimeter(), 14);
        		assertEquals(shape[4].perimeter(), 38);
        		
        		setShape("Square");
        		assertEquals(shape[0].perimeter(), 60);
        		assertEquals(shape[1].perimeter(), 20);
        		assertEquals(shape[2].perimeter(), 24);
        		assertEquals(shape[3].perimeter(), 12);
        		assertEquals(shape[4].perimeter(), 100);
    }
}
