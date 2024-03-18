package com.npci;

import java.util.Scanner;

public class TestDigitInWords {

	public static void main(String[] args) {
		// use scanner to enter 3 digits in string format using next()
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 digits number:-");
		String digits = scan.next();
		// for loop to iterate 3 times : by extracting character on each iteration 
		for(int i = 0; i < 3; i++) {
			char ch = digits.charAt(i);
			switch(ch) {
				case '0' : System.out.println("Zero");
				break;
				case '1': System.out.println("One");
				break;
				case '2' : System.out.println("Two");
				break;
				case '3': System.out.println("Three");
				break;
				case '4' : System.out.println("Four");
				break;
				case '5': System.out.println("Five");
				break;
				case '6' : System.out.println("Six");
				break;
				case '7': System.out.println("Seven");
				break;
				case '8' : System.out.println("Eight");
				break;
				case '9': System.out.println("Nine");
				break;
				default: System.out.println(ch+" is not a digit");
			}
		}
		scan.close();
	}

}
