package object_orientation;

public class Human {
	String name;
	int age;
	double height;
	String eyecolor;
	
	// a constructor method does not need a return and is automatically created for classes that dont have one
	public Human() {
		
	}
	
	// a constructor can be used to set initial values to the fields you want like this
	public Human(String name, int age, double height, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyecolor = eyecolor;
	}
	
	
	


	public void speak () {
		System.out.println("My name is " + name + ", I am " + age + " years old and " + height + " meters tall");
	}

	public void eat() {
		System.out.println("eating...");
	}
}
