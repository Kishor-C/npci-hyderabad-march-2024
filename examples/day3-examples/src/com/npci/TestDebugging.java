package com.npci;

public class TestDebugging {
	public static void main(String[] args) {
		System.out.println("main starts");
		int x = 5;
		test(++x);
		x++;
		System.out.println("x in main = "+x);
		System.out.println("main ends");
	}
	public static void test(int y) {
		System.out.println("y in test = "+y);
		int x = 10/0;
		System.out.println("x in test = "+x);
		System.out.println("test ends");
	}
}
