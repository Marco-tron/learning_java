package strings_practice;

public class StringsPractice {

	public static void main(String[] args) {
		String a = "hello there my fellow there are many variables";
		// a string can acctually call the method .length to tell us its length
		System.out.println(a.length());
		
		String str = "ABCDEFG";
		
		//substring is a method that can cut strings where you want
		System.out.println(str.substring(3));
		
		if (a.equals("hello")) {
			// this is the correct method of comparing strings
			System.out.println("comparing strings");
		}
		
		if (a.equalsIgnoreCase("Hello")) {
			// compare ignoring uppercase
			System.out.println("ignoring uppercase");
		}
		
		
		//charat gets the char located at the corresponding index
		System.out.println(a.charAt(2));
		
		// locates the first ocurrence of the substring
		System.out.println(a.indexOf("there"));
		
		// you can add a starting index
		System.out.println(a.indexOf("there", 7));
		
		
		// searchs from the right to left
		System.out.println(a.lastIndexOf("there"));
	}

}
