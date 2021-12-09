package classroomDec7;

public class Vehicle {
	String color;
	int weheelcount;
	int gearsCount;

	Vehicle() {
		this("Red", 89);
		System.out.println("First Constructor");
	}

	Vehicle(String color, int wheelcount) {
		this("Green", 89, 23);
		System.out.println("Second constructor");
	}

	Vehicle(String color, int wheelcount, int gearsCount) {
		System.out.println("3 rd Constructor");
	}

	public static void main(String[] args) {
		new Vehicle();
	}
}
