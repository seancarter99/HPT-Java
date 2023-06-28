package com.skillstorm.oop;

import com.skillstorm.oop.zoo.Honeybadger;

// Class is the blueprint for creating objects
// They hold properties, abilities, etc.
// For a person, we might hold favoriteColor, height, name, age
public class Person {

	// Properties
	String favoriteColor;
	float height;
	String name;
	int age;
	
	// Constructor
	// Creates the object and offers a nice place to do any initialization logic
	Person(String favoriteColor, float height, String n, int a) {
		// "this" means the object currently being used
		this.favoriteColor = favoriteColor;
		this.height = height;
		this.name = n;
		age = a;
	}
	
	// Write a function that introduces themselves
	public void introduce() {
		      //                           sean.name
		System.out.println("My name is " + this.name);
	}
	
	// Is eligible for the NBA
	public boolean isEligibleForNBA() {
		if (height < 6.0 || age < 19 || name == "Sean") {
			return false;
		} else {
			return true;
		}
	}
	
	// Objects are "instances" of a class
	// An individual person
	public static void main(String[] args) {
		Person sean = new Person("Blue", 6.55f, "Seeean", 23);
//		sean.favoriteColor = "Blue";
//		sean.height = 5.55f;
//		sean.name = "Sean";
//		sean.age = 23;
		System.out.println(sean.height);
		
		sean.introduce();
		System.out.println(sean.isEligibleForNBA());
		Person brent = new Person("Blue", 6.00f, "Brent", 19);
		System.out.println(brent.isEligibleForNBA());
		
		Honeybadger h = new Honeybadger();
	}
}
