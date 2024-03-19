package com.npci;

public class TestInheritance {
	public static void main(String[] args) {
		Person person1 = new Person("A", 35);
		Employee employee1 = new Employee(123, "B", 30, 40000);
		double marks[] = {77, 88, 99, 66, 54};
		Student student1 = new Student(5, "C", 16, marks);
		Person px = null;
		px = employee1; 
		px.display();
		px = student1;
		px.display();
		px = person1;
		px.display();
//		person1.display();
//		employee1.display();
//		student1.display();
		testPoly(person1);
		System.out.println("--------------------------------------");
		testPoly(employee1);
		System.out.println("--------------------------------------");
		testPoly(student1);
	}
	
	// a method to understand polymorphism
	public static void testPoly(Person per) {
		per.display(); // 3 different results
	}
}
