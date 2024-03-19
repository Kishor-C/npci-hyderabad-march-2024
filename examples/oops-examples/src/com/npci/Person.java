package com.npci;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String, age) constructor");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void display() {
		System.out.println("---- Person Display ----");
		System.out.println("Name = "+name+", Age = "+age);
	}
}
