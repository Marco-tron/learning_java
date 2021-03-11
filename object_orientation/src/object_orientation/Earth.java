package object_orientation;

public class Earth {

	public static void main(String[] args) {
		Human marco;
		
		// with this you are creating an instance of a clss, an object
		marco = new Human();
		
		marco.age = 22;
		marco.eyecolor = "beige";
		marco.height = 1.96;
		marco.name = "Marco Aurelio";
		
		// you can also assign values when the constructor is called
		Human bob = new Human("Bob Sheppard", 34, 1.85, "blue");
		
		marco.speak();
		bob.speak();
		
		Chicken chick1 = new Chicken(1, "F", 250);
	
		// fly from bird is overwriten by chicken
		chick1.fly();
		
		
		// because animal is an abstract class that is extended
		// it can be a variable type for an object that extends it
		//this way it can invoke only the abstract class methods
		Animal chick2 = new Chicken(2,"M",300);
		
		
		chick2.move();
	}

}
