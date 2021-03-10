package java_basics;

public class Arrays {
public static void main(String[] args) {
	
	//this is how you store a single variable
		int value;
		value = 100;
		
	// you use [] to store arrays new in[100] determines that the array can have up to 100 slots
		int [] values = new int[100];
		
		values[0] = 1000;
		values[20] =234;
		
		// this will only print the array reference
		System.out.println(values);
		
		// this  will print the values correctly
		System.out.println(values[20]);
		
		// you can also initialize with values
		String [] words = new String [] {"Hello", "my", "name", "ïs"};
		System.out.println(words[3]);
		
		
		//if you initialize a new array on the same variable so you can store more data you will lose the previous data stored
		words = new String[10];
		System.out.println(words[3]);
		

	}
}
