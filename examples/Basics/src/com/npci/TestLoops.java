package com.npci;

public class TestLoops {
	public static void main(String[] args) {
		// array of int[] with 5 elements
		int[] items = {7, 1, 9, 5, 8};
		// length is a property that gives the size of the array
		System.out.println("Size: "+items.length);
		// index to access a particular element
		System.out.println("Item at 2: "+items[2]);
		// for loop to iterate
		for(int index = 0; index < items.length; index++) {
			System.out.println("Item at "+index+" is : "+items[index]);
		}
		// iterating from 1 to 5 - for loop is used
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("---- While Loop ----");
		int whileLoopCounter = 1;
		while(whileLoopCounter <= 5) {
			System.out.println("While Loop Counter: "+whileLoopCounter);
			whileLoopCounter++;
		}
		System.out.println("--- Do While Loop ----");
		// do while - at least once the statement is executed
		do {
			System.out.println("Do while loop counter: "+whileLoopCounter);
			whileLoopCounter++;
		} while(whileLoopCounter <= 5);
	}
}

