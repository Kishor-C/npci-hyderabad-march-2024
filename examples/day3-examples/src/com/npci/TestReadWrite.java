package com.npci;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestReadWrite {
	public static void main(String[] args) {
		//write("Hello World3");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some string:-");
		String content = scan.nextLine();
		scan.close();
		try {
			write(content);
		} catch (EmptyDataException e) {
			e.printStackTrace(); // log all the messages in a server console
			System.err.println(e); // log the exception class in the server console
			System.err.println(e.getMessage()); // print the exception message on the UI
		}
	}
	public static void write(String data) throws EmptyDataException {
		// this is a try with resource that automatically closes the resources
		// in try () you must create objects which are actually resources like FileWriter, FileReader
		// Scanner, Connection
		try  (FileWriter writer = new FileWriter("hello.txt", true);)  {
			// hello.txt is created inside the project root directory
			if(data == null || data.length() == 0) {
				throw new EmptyDataException("empty data cannot be written: data : "+data);
			}
			// if file doesn't exist, it will be created - happens only while writing the data
			writer.write(data + "\n"); // data is written to the output buffer, hence you need to call flush
			// data is written to the file after the flush
			 // closes the resource, we need to write this in finally block
			System.out.println("Data is written to the file:-");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block executed");
		}
	}
}
