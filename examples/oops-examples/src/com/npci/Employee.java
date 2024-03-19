package com.npci;

public class Employee extends Person {
	private int id;
	private double salary;
	
	// constructor to initialize id, name, age & salary
	public Employee(int id, String name, int age, double salary) {
		// super() is created in the first line if not manually use super(args, args);
		super(name, age); // Person(String,
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(int, String, int, double) constructor");
	}
	// override : method names & signature must be same and logics may vary
	@Override
	public void display() {
		System.out.println("---- Employee Display ---");
		System.out.println("Id = "+id+", Name = "+getName()+", Age = "+getAge()+", Salary = "+salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
