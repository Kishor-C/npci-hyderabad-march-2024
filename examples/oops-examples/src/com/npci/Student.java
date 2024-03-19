package com.npci;

import java.util.Arrays;

public class Student extends Person {
	private int rollNo;
	private double[] marks;
	public Student(int rollNo, String name, int age, double[] marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	@Override
	public void display() {
		System.out.println("----- Student Display ------");
		double sum = 0;
		for(int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println("Rollno = "+rollNo+", Name = "+getName()
		+", Age = "+getAge()+", Average Marks = "+(sum / marks.length));
		System.out.println("Marks: "+Arrays.toString(marks));
		
	}
	
	
}
