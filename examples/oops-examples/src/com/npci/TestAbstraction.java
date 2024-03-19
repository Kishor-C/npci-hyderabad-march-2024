package com.npci;

// all the interfaces & classes must be in separate java files
interface Vehicle { 
	void wheels();
	void mileage();
}
abstract class Bike implements Vehicle {
	public void wheels() {System.out.println("2 wheels"); }
}
abstract class Car implements Vehicle {
	public void wheels() {System.out.println("4 wheels");}
}
// create subtypes for Bike & Car
class Nexon extends Car {
	public void mileage() {System.out.println("Nexon mileage: 18kmpl");}
}
class Kia extends Car {
	public void mileage() {System.out.println("Kia mileage: 20kmpl");}
}
// create subclasses for Bike and implement mileage
public class TestAbstraction {
	public static void testAbstractAndPolymorphism(Vehicle v) {
		v.mileage(); // polymorphic in nature
		v.wheels();  // polymorphic in nature
		System.out.println("-----------------");
	}
	public static void main(String[] args) {
		testAbstractAndPolymorphism(new Nexon());
		testAbstractAndPolymorphism(new Kia());
		// create subclasses for Bike and pass their objects to testAbstractAndPolymorphism
	}
}
