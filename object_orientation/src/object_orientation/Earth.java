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
		
		Human bob = new Human("Bob Sheppard", 34, 1.85, "blue");
		
		marco.speak();
		bob.speak();
	}

}
