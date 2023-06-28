package com.skillstorm.oop.interfaces;

/**
 * Abstract Class vs Interface
 * 
 * Similarities:
 * - You cannot instantiate either
 * - They both act as a "root type"
 * 
 * Differences:
 * - Interfaces are more lightweight
 * - Interfaces don't contain properties, non abstract methods, or constructors
 * - Classes can ONLY extend one other class
 * - Classes can implement ANY NUMBER of interfaces
 * 
 */
public interface Driveable {

	// drive()
	public void drive(); // abstract method. Anything implementing this interface MUST provide a defintion
}
