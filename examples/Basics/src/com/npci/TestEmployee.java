package com.npci;

public class TestEmployee {
	public static void main(String[] args) {
		// creating an object of Employee
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		System.out.println("---- Display Information -----");
		emp1.display();
		System.out.println("-----------------------------");
		emp2.display();
		// initialize each property of emp1
		emp1.id = 101;
		emp1.name = "Raj";
		emp1.salary = 52000;
		// initialize each property of emp2
		emp2.id = 102;
		emp2.name = "Vijay";
		emp2.salary = 54000;
		System.out.println("---- Display Information -----");
		emp1.display();
		System.out.println("-----------------------------");
		emp2.display();
		System.out.println("---- Creating object on Employee using parameterized constructor ----");
		Employee emp3 = new Employee(103, "Alex", 50000.0);
		Employee emp4 = new Employee(104, "Brad", 450000.0);
		emp3.display();
		emp4.display();
		System.out.println("--------------------------");
		Employee.companyAddress();
	}
}
