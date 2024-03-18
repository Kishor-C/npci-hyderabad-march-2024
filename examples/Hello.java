class A { 
	// comment that is not compiled - its an empty class to see what happens after compilation
}  // this bracket ends class A
class B { 
	// main method : an entry point - in java its public static void main(String[] args)
	// notice S is in upper case in String, the [] is an array
	public static void main(String[] args) { 
		// In java you can print using System.out.println("..."); here 'S' is capital in System
		System.out.println("Welcome to our first java program");
	} // this bracket ends the main method
} // this bracket ends the class B

/*	
	Ensure you have saved the code before compiling
	Compile : javac Hello.java
	Run: java B
*/