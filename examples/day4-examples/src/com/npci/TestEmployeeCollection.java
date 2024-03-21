package com.npci;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestEmployeeCollection {
	public static void main(String[] args) {
		Employee emp1 = new Employee(10, "Alex", LocalDate.parse("1998-10-25"), 35000);
		Employee emp2 = new Employee(30, "Alex", LocalDate.parse("1994-10-25"), 65000);
		Employee emp3 = new Employee(40, "Alex", LocalDate.parse("1997-10-25"), 75000);
		Employee emp4 = new Employee(20, "Alex", LocalDate.parse("1999-10-25"), 85000);
		Employee emp5 = new Employee(50, "Alex", LocalDate.parse("2000-10-25"), 25000);
		Employee emp6 = new Employee(40, "Alex", LocalDate.parse("1997-10-25"), 75000);
		Employee emp7 = new Employee(20, "Alex", LocalDate.parse("1999-10-25"), 85000);
		Employee emp8 = new Employee(50, "Alex", LocalDate.parse("2000-10-25"), 25000);
		
		// storing the employees in any one collection
		//List<Employee> employees = new ArrayList<>();
		Set<Employee> employees = new HashSet<>();
		employees.add(emp1);	employees.add(emp2);	
		employees.add(emp3);	employees.add(emp4);	employees.add(emp5);	
		employees.add(emp6);	employees.add(emp7);	employees.add(emp8);
		// iterating using Iterator: import java.util.Iterator
		System.out.println("Size: "+employees.size());
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee e = it.next(); 
			// it.remove(); // removes the iterated element
			System.out.println(e);
		}
		
	}
}
