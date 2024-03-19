package com.npci;

public class TestEncapsulation {
	public static void main(String[] args) {
		Person person1 = new Person("Sachin", 50);
		// person1.name = "Sourav"; can't access the private members directly
		// person1.age = 49; can't access the private members directly
		person1.setAge(49);
		person1.display();
	}
}
