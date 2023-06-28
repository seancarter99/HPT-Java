package com.skillstorm.oop.interfaces;

import com.skillstorm.oop.Person;
import com.skillstorm.oop.zoo.Honeybadger;

public class AAA {

	// Polymorphism 
	// Many Forms
	
	// Runtime Polymorphism -> Java at runtime knows what got passed in
	public static void driveVehicle(Driveable driveableEntity) {
		driveableEntity.drive();
	}
	
	// A rose by any other name would smell just as sweet
	
	public static void main(String[] args) {
		Driveable car = new Car();
		Bicycle bike = new Bicycle();
		Scooter scoot = new Scooter();
		Honeybadger h = new Honeybadger();
		
		driveVehicle(bike);
		driveVehicle(scoot);
		driveVehicle(car);
		driveVehicle(h);
	}
}
