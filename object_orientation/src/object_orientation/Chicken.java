package object_orientation;

public class Chicken extends Bird {

	public Chicken(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}
	
	//overriding the method defined in Bird
	public void fly() {
		System.out.println("Not able to fly...");
	}

}
