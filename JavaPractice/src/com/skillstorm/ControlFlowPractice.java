package com.skillstorm;

public class ControlFlowPractice {

	public static void c() {
		System.out.println("c");
	}

	public static void a() {
		System.out.println("a");
		b();
	}

	public static void b() {
		c();
		System.out.println("b");
	}

	// a c b c b c
	public static void main(String[] args) {
		a();
		b();
		c();
	}
}
