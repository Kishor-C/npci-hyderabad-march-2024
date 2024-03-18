package com.npci;

import java.util.Scanner;

public class TestConditions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = scan.nextInt();
		System.out.println("Marks: "+marks);
		if(marks >= 80) {
			System.out.println("Grade: A+");
		} 
		else if(marks < 80 && marks >= 60) {
			System.out.println("Grade: A");
		} 
		else if(marks < 60 && marks >= 50) {
			System.out.println("Grade: B");
		}
		else if(marks < 50 && marks >= 40) {
			System.out.println("Grade: C");
		} 
		else {
			System.out.println("Grade: D");
		}
		System.out.println("---- Switch Statement ----");
		System.out.println("Enter 4 options 1: Withdraw 2: Change Pin 3: Mini Statement");
		int option = scan.nextInt();
		switch(option) {
			case 1: System.out.println("Amount will be withdrawn");
			break;
			case 2: System.out.println("Pin will be changed");
			break;
			case 3: System.out.println("Mini statement will be generated");
			break;
			default : System.out.println("Invalid options");
		}
		scan.close(); // keep this at the end
	}
}
