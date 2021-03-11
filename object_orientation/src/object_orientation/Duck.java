package object_orientation;

// the implements keyword draws functions from the interface
public class Duck extends Bird implements Swims{

	public Duck(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println("Duck is swimming...");		
	}  

}
