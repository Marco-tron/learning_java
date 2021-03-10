package object_orientation;

//using extends you create a subclass that inherits the other class properties
public class Bird extends Animal {
	
	
	public Bird(int age, String gender, int weight) {
		// this calls the super constructor to the animal class so it can set the properties
		super(age, gender, weight);
	}

	// this is only available to bird, not animal
	public void fly() {
		System.out.println("Flying...");
	}
}
