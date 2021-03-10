package java_basics;

public class Methods {

	public static void main(String[] args) {
		//println is an method that receives data and prints the data to the screen
		System.out.println("Hello there");
		// calling the printing method you estabilished outside of main
		Printing();
		PrintingWithVariables("I am pasting this data");
		
		Utils.UtilsPrinting("Hey theree, I'm using a method from another class");
		
		
		//you can also make a function return some value to be used by other functions
		System.out.println(Utils.add10(25));
		
	}
	// here you are defining a method that will be called by the main method
	public static void Printing() {
	System.out.println("printing something");
	
	}
	
	// you can also pass variables to methods
	public static void PrintingWithVariables(String a) {
		System.out.println(a);
		
		}
	// you can have more than one method with them accepting different variable types
	public static void PrintingWithVariables(int a) {
		System.out.println("Pasting an Integer: "+a);
		
		}
	
	// methods defined without static can only be accessed via an instance of the class
}

