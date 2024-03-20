package com.npci;

public class TestStrings {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = new String("hello");
		String s4 = "hello";
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		// comparing the string objects
		System.out.println("with s1 == s2: "+(s1 == s2));// false
		System.out.println("with s1 == s4: "+(s1 == s4)); // true
		System.out.println("with s1 equals s2: "+s1.equals(s2)); // true
		System.out.println("s3 concat(123) = "+s3.concat("123")); //hello123
		s3.concat("123");
		System.out.println("s3 = "+s3); // hello
		System.out.println("s1 = "+sb1+", sb2 = "+sb1);
		System.out.println("sb1 equals sb2 = "+sb1.equals(sb2)); // calls Object equals()
		System.out.println("sb1 append 123 = "+sb1.append("123"));;
		System.out.println("sb1 after append: "+sb1);
	}
}
