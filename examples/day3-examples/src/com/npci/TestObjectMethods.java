package com.npci;

import java.time.LocalDate;

public class TestObjectMethods {
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Raj");
		Employee e2 = new Employee(13, "Vijay");
		System.out.println(e1); // e1.toString() is called internally
		System.out.println(e2); // e2.toString()
		
		LocalDate today = LocalDate.now(); // local date object with date, year & month properties
		LocalDate dob = LocalDate.parse("2017-01-25"); //local date object in ISO format
		
		System.out.println("Today: "+today); // today.toString() is called internally
		System.out.println("Dob: "+dob); // dob.toString() is called internally
		
	}
}
