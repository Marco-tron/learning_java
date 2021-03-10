package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true;
		
		// if else statments are like in many other languages where if the value inside () is true it will execute the if statments
		if (hungry) {
			System.out.println("Ï want food");
		} else {
			System.out.println("Ï'm not hungry ");
		}
		
		// switch is another way to administer cases in the code
		int month=3;
		String monthString;
		switch(month) {
		
		case 1: monthString = "January";
		break;
		case 2: monthString = "February";
		break;
		case 3: monthString = "March";
		break;
		case 4: monthString = "April";
		break;
		default: monthString ="U nkown Month";
		break;
		}
		System.out.println(monthString);
		
	}

}
