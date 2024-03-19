package com.npci;

public class Employee {
	int id; // initialize either inside the constructor or at the time of declaration
	String name;
	double salary;
	final static String companyName = "NPCI";
	Employee() {
		System.out.println("Employee() constructor");
	}
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		System.out.println("Employee(int, String, double) constructor");
	}
	// display method to print id, name & salary
	void display() {
		System.out.println("Id="+id+",Name="+name+",Salary="+salary);
		System.out.println("Company = "+companyName);
	}
	static void companyAddress() {
		System.out.println("Company Name = "+companyName);
		System.out.println("Hyderabad, Mumbai, Chennai");
		//System.out.println("Id = "+id);
		Employee e1 = new Employee();
		System.out.println(e1.id);
	}
} 
