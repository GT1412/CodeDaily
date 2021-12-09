package classroomDec7;

public class Vehicle1 {
	String color;
	int wheelcount;
	int gearsCount;

	Vehicle1() {
		color = "Red";
		wheelcount = 4;
		gearsCount = 6;

		System.out.println("First Constructor");
	}

	Vehicle1(String color, int wheelcount) {
		this();
		System.out.println("Second constructor" +" Color " +color +" WheelCount "+wheelcount+" Gear Count " +gearsCount);
	}

	public static void main(String[] args) {
		new Vehicle1("Blue ", 2);
	}
}
