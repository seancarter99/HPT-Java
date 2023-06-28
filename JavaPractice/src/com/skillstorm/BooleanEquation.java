package com.skillstorm;

public class BooleanEquation {
	
	public static boolean shouldWatchMovie(boolean isRaining, String dayOfWeek) {
		return isRaining == true && dayOfWeek == "Saturday" || dayOfWeek == "Sunday";
	}
	
	// I want a function that determines whether or not I can keep a fish
	// I can only keep Smallmouth bass for the species
	// I can only keep the smallmouth if it is at least 30 inches long
	// If it's a female, I cannot keep it
	
	public static boolean shouldACGoOn(short temp) {
		return temp >= 75;
	}
	
	// College Admissions Criteria:
	// Gender (Must be female)
	// GPA (Must be greater than 3.2)
	// Age (Must be 18+)
	public static boolean isIllegibleForAdmission(String gender, float gpa, int age) {
		// if / else statements
		if (age < 18) {
			return false;
		}
		// This point and down, I know the age is 18+
		if (gender != "Female") {
			return false;
		}
		// This point and down, I know the age is 18+ AND they are female
		// This one takes the longest, it'll go last
		if (gpa < 3.2) {
			return false;
		}
		return true;
	}
	
	public static char calculateLetterGrade(double grade) {
		// Return A 90%-100%
		// Return B 80%-89.9999%
		if (grade >= 90) {
			return 'A';
		}
		else if (grade >= 80) {
			return 'B';
		}
		else if (grade >= 70) {
			return 'C';
		}
		else if (grade >= 60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
	// Calculates a pass or fail for a transcript
	// Return 'P' for pass or 'F' for fail
	public static char calculatePassFail(double grade) {
		// Ternary operator
		// boolean logic ? value to return if true : value to return if false
		return (grade >= 60) ? 'P' : 'F';
		
//		if (grade >= 70) {
//			return 'P';
//		} else {
//			return 'F';
//		}
	}

	public static void main(String[] args) {
		
		/**
		 * Logical Operators
		 * 
		 * AND &&
		 * OR ||
		 * EQUALS ==
		 * NOT !
		 * NOT EQUALS !=
		 * LESS THAN <
		 * GREATER THAN >
		 * LESS THAN OR EQUAL TO <=
		 * GREATER THAN OR EQUAL TO >=
		 */
		
		// If this AND that are true, then this. Otherwise, that
		// If it rains today AND it's the weekend, I'll put on a movie
		boolean isRaining = false;
		String dayOfWeek = "Saturday";
		
		// Take these two and mold it to the statement above
//		boolean shouldWatchMovie = isRaining == true && dayOfWeek == "Saturday" || dayOfWeek == "Sunday";
		
		boolean answer = shouldWatchMovie(isRaining, dayOfWeek);
		
		System.out.println(answer);
		
		System.out.println("Should the AC go on: " + shouldACGoOn((short) 75));
		
		boolean gotAccepted = isIllegibleForAdmission("Female", 3.5f, 18);
		System.out.println("Was accepted to college? " + gotAccepted);
		
		// Using these functions with if statements
		if (isIllegibleForAdmission("Female", 3.8f, 17)) {
			// If they are accepted
			System.out.println("Best of luck at college!");
		} else {
			// If they are NOT accepted
			System.out.println("You should look for a summer job!");
		}
		
		if (shouldACGoOn((short) 80)) {
			// Turn on AC
		} else {
			// Turn off AC
			// sysout + CTL + SPACE
			
		}
		
		char letterGrade = calculateLetterGrade(103);
		System.out.println(letterGrade);
	}

}
