package com.npci;

public class TestWrappers {
	public static void main(String[] args) {
		// converting string to number
		String amount = "10000";
		int value = Integer.parseInt(amount);
		System.out.println(value + 5000);
		System.out.println(amount + 5000);
		System.out.println("Binary value of 8: "+Integer.toBinaryString(8));
		// compares 2 value and returns 0 or -ve or +ve this will be useful for sorting
		System.out.println("Compare 20 and 30: "+Integer.compare(20, 30));
		System.out.println("Compare 30 and 20: "+Integer.compare(30, 20));
		System.out.println("Compare 30 and 30: "+Integer.compare(30, 30));
		System.out.println("--- We can also comapre double values -----");
		System.out.println("Compare 20.0 and 30.0: "+Double.compare(20.0, 30.0));
		// other than wrapper class string can also compared
		String s1 = "Ajay";
		String s2 = "Brad";
		String s3 = "Ajay";
		System.out.println("Compare Ajay and Ajay: "+s1.compareTo(s3)); 
		System.out.println("Compare Ajay and Abhi: "+s1.compareTo(s2));
		System.out.println("Compare Abhi and Ajay: "+s2.compareTo(s1));
	}
}
