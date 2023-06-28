package com.skillstorm.exceptions;

public class ExceptionPractice {

	public static int divide(int x, int y, String password) throws InvalidPasswordException {
		if (password != "password") {
			// Cause an exception
			throw new InvalidPasswordException(password + " is an invalid password");
		}
		return x / y;
	}
	
	public static void a() {
		// try/catch blocks
		try {
			// Put code that "could" break
			b();
		} catch (ArithmeticException e) {
			// Put the code that happens when an exception does occur
			System.out.println("Exception handled");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception handled");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPasswordException e) {
			// What happens if the password is wrong?
			System.out.println(e.getMessage());
		} catch (Exception e) { // equivalent of an else block. Handles everything
			System.out.println("Generic Exception");
		}
	}
	
	public static void b() throws InvalidPasswordException {
		divide(5, 1, "abc");
	}
	
	public static void main(String[] args) {
		// User inputs 2 numbers
//		divide(5, 0);
		a();
		System.out.println("End of program");
	}

}
