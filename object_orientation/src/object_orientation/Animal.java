package object_orientation;

// an abstract class can never be implemented, only extended
public abstract class Animal {
	int age;
	String gender;
	int weight;
	
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	public void sleep () {
		System.out.println("sleeping...");
	}
	
	public void eat () {
		System.out.println("eating...");
	}
	
	public abstract void move();
}
