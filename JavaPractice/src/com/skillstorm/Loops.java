package com.skillstorm;

public class Loops {

	public static void main(String[] args) {
		/**
		 * While Loop - Repeat the code, while some condition is met ** For Loop -
		 * Initializes some counter, checks the condition, increment the counter Great
		 * for code you want to run x number of times ** Enhanced For Loop - Loops over
		 * some "iterable" entity * Do While Loop - While loop that always runs at least
		 * once
		 */

		double balance = 1000;
		// Each iteration of the loop, spend 100 dollars until there's no more money
//		boolean bool = true;
		while (balance > 0) {
			System.out.println("Current Funds: " + balance);
			// Prompt the user to spend money
			balance -= 100; // balance = balance - 100;
		}
		System.out.println("Finished Loop");
		System.out.println("End Balance: " + balance);

		// Print from 1 to 100
		int count = 1;
		while (count <= 100) {
			System.out.println(count);
			count += 1;
		}

		// i += 1;
		// counter init; boolean eq; increment counter
		for (int i = 1; i <= 10000; i++) {
			System.out.println("Current Count: " + i);
		}

		// Enhanced For Loop
		// Downside is no index
		String s = "The sun is shining today!";
		for (char ch : s.toCharArray()) {
			System.out.println(ch);
		}

		// Do While Loop
		do {
			System.out.println("Inside Do While Loop");
		} while (false);

		// Nested Loops
		// Go around the room 5 times
		// Each time, do 20 push ups, 10 sit ups, and 5 pull ups
		for (int round = 1; round <= 10; round++) {
			System.out.println("\n\nSTARTING ROUND " + round + "\n\n");
			for (int push = 1; push <= 20; push++) {
				System.out.println("Push UP: " + push);
			}
			for (int sit = 1; sit <= 10; sit++) {
				System.out.println("Sit UP: " + sit);
			}
			for (int pull = 1; pull <= 5; pull++) {
				System.out.println("Pull UP: " + pull);
			}
			System.out.println("\n\nENDING ROUND " + round + "\n\n");
		}
	}
}
