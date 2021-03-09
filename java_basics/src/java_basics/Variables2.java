package java_basics;

public class Variables2 {
	public static void main(String[] args) {
		
		// int can only accept numbers as large as 32 bits, 2ˆ32 so 10000000000 cant be stored in an int
		// int x = 10000000000;
		
		//long can store data bigger than int, you need to end the number with an "L" so it can be read
		long bigNumber = 1000000000000000000L;
		
		//long also requires much more memory than an int
		
		// short is a variable type that can store up to 32767, that is shorter than int but also more efficient
		short smallNumber = 32767;
		
		// a byte can only store up to 127
		byte reeeeallySmallN = 127;
		
		//double is a variable so you can store decimals
		double decimal = 3.55;
		
		//boolean is a datatype for true and false
		boolean decision = false;
		
		// char stores single letters
		char letter = 'w';
	}
}
