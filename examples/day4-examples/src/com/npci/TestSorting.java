package com.npci;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {
	public static void main(String[] args) {
		Set<String> stringSet = new TreeSet<>();
		stringSet.add("Hello");		stringSet.add("HELLO");		stringSet.add("hello");
		System.out.println(stringSet); // HELLO, Hello, hello
		
		Set<Integer> integerSet = new TreeSet<>();
		integerSet.add(5);	integerSet.add(1);	integerSet.add(3);	integerSet.add(2);
		System.out.println(integerSet);
		// adding complex objects in the tree set
		Employee emp1 = new Employee(10, "Alex", LocalDate.parse("1998-10-25"), 35000);
		Employee emp2 = new Employee(30, "Alex", LocalDate.parse("1994-10-25"), 65000);
		Employee emp3 = new Employee(40, "Alex", LocalDate.parse("1997-10-25"), 75000);
		Employee emp4 = new Employee(20, "Alex", LocalDate.parse("1999-10-25"), 85000);
		Employee emp5 = new Employee(50, "Alex", LocalDate.parse("2000-10-25"), 25000);
		
		// creating an anonymous inner class of Comparator 
		Comparator<Employee> c1 = new Comparator<>() { 
			public int compare(Employee x, Employee y) {
				return Double.compare(x.getSalary(), y.getSalary());
			}
		} ; // end of anonymous implementation
		// now you can create 5 more Comparator implementation for sorting in ascending & descending
		// implement Comparator to sort employee based on dob in ascending order & pass the reference
		// to the TreeSet
		Comparator<Employee> c2 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getDob().compareTo(o2.getDob());
			}
			
		};
		Set<Employee> employeeSet = new TreeSet<>(c2); // calls the compare of Comparator
		employeeSet.add(emp1); // compare(emp1, emp1)
		employeeSet.add(emp2); // compare(emp2, emp1)
		employeeSet.add(emp3); // compare(emp3, emp1), compare(emp3, emp2) if required
		employeeSet.add(emp4); // compare(emp4, emp1), compare(emp4, emp3) if required
		employeeSet.add(emp5); 
		for(Employee e : employeeSet) {
			System.out.println(e);
		}
	}
}
