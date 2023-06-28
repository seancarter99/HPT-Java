package com.skillstorm.oop.geometry;

// Square will inherit all properties and methods from Rectangle (code reuse)
public class Square extends Rectangle {
	
	// Creating a Square
	public Square() {
		// Line one of the constructor attempts to call Rectangle()
		super(5, 5); // Rectangle();
//		this.length = 10;
//		this.width = 10;
	}
	
	public Square(double length) {
//		super();
		super(length, length); // Forwarding the values to the Rectangle constructor
	}
	
	@Override
	public String toString() {
		return "Square: [length: " + length + ", width: " + width + "]";
	}
	
	public static void main(String[] args) {
		Square sq = new Square();
		System.out.println(sq.calculateArea());
		System.out.println(sq.length);
	}
}
