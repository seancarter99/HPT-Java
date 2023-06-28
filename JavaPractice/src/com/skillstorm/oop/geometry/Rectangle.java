package com.skillstorm.oop.geometry;

// If a class doesn't inherit anything, it extends Object
public class Rectangle extends Object {

	// 1. List all the properties of the class
	double length;
	double width;
	
	// 2. Create constructor
	public Rectangle() {
		this.length = 3.0;
		this.width = 2.0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// 3. Create any functions/methods this might need
	
	// Calculates the perimeter
	public double calculatePerimeter() {
		return (2 * width) + (2 * length);
	}
	
	public double calculateArea() {
		return length * width;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 10);
		System.out.println(r.calculatePerimeter());
		Rectangle r2 = new Rectangle();
	}
}
