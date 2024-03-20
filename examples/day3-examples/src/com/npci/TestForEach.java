package com.npci;

public class TestForEach {
	public static void main(String[] args) {
		//String[] arr = {"hello", "welcome", "thankyou"};
		System.out.println("-- for loop ---");
		for(int index = 0; index < args.length; index++) {
			System.out.println("Index = "+index+", Element = "+args[index]);
		}
		System.out.println("-- for each loop --");
		for(String s : args) {
			System.out.println("s = "+s);
		}
		
	}
	
}
