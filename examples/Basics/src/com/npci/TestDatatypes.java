package com.npci;

import java.util.Scanner;

public class TestDatatypes {
	public static void main(String[] args) {
		// Type Scanner and use control + space to import
		Scanner scan = new Scanner(System.in);
		// variables in java starts with lowercase & use camel case for more than one word
		System.out.println("Enter an id:-");
		int employeeId = scan.nextInt();
		// character is enclosed in single quote
		System.out.println("Enter gender:- M/F");
		char gender = scan.next().charAt(0);
		// String is enclosed in double quotes - String is a predefined class
		scan.nextLine();
		System.out.println("Enter name:-");
		String name = scan.nextLine(); 
		// try taking input for other datatypes
		System.out.println("Is Married:- true/false");
		// boolean takes true or false
		boolean isMarried = scan.nextBoolean(); // true or false is a reserve word
		System.out.println("Enter phone:-");
		// long can be used for the digits which are > 10, but long must be suffixed with L
		long phone = scan.nextLong();
		System.out.println("Enter salary:-");
		// double can be used for floating point numbers
		double salary = scan.nextDouble();
		// close resource
		scan.close();
		// To print you can concatenate the string and the value using + operator
		System.out.println("Name = "+name); // Name = Alex
		// Print other values in the console in the below format - print in one line
		// Id = 8299339, Gender = M, Phone = 9900887766, Salary = 35000.23, Married = true
		System.out.println("Id = "+employeeId+", Gender = "+gender+
				", Phone = "+phone+", Salary = "+salary+", Married = "+isMarried);
	}
}
