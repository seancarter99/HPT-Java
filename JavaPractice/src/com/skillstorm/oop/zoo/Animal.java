package com.skillstorm.oop.zoo;

// Abstraction
// Facade Design Pattern
public abstract class Animal {
	
	private String name;
	
	public Animal() {
		// This exists for types of Animals being created (ex. Honeybadger)
		System.out.println("Inside Animal constructor");
	}

	// Composed of abstract methods
	public abstract void speak(); // I won't provide a definition for the method
	
	public static void main(String[] args) {
//		Animal a = new Animal();
		Honeybadger b = new Honeybadger();
	}
}
