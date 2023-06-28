package com.skillstorm.oop.geometry;

public class Rhombus extends Square {

	public Rhombus() {
		super(); // super() will call Square(), and Square() will call Rectangle()
	}
	
	public Rhombus(double length) {
		super(length);
	}
	
	// calculating area is NOT length * width
	// length + width
	// Method OVERRIDING
	@Override
	public double calculateArea() {
		return length + width;
	}
	
	public static void main(String[] args) {
		Rhombus r = new Rhombus(5);
		System.out.println(r.calculateArea());
		System.out.println(r);
		Square sq = new Square();
		System.out.println(sq);
	}
}
