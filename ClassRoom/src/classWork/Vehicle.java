package classWork;

public class Vehicle {
	String color;
	int wheelCount, gearCount;

	Vehicle() {
		this("Black", 6);
		this.color = color;
		this.wheelCount = wheelCount;
		this.gearCount = gearCount;
		System.out.println(" First Color "+color+" Gear " +gearCount +"");

	}

	Vehicle(String color, int gearCount) {
		this("Green ", 9, 5);

		System.out.println(" Second Color "+color+" Gear " +gearCount);
	}

	Vehicle(String color, int wheelCount, int gearCount) {
		System.out.println(" Third Color " +color+" Gear " +gearCount+ " Wheel Count "+wheelCount);
	}

	public static void main(String[] args) {
		new Vehicle();
//		new Vehicle("Red", 5);
//		new Vehicle("Black", 9, 5);

	}
}
