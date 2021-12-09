package classroomDec7;

public class Circle1 {
	float areaOfCircle(float pi, float radius) {
		return (pi * radius * radius);

	}

	float cicumOfCircle(float radius) {
		return (2 * 3.5f * radius);
	}

	public static void main(String[] args) {
		Circle1 c = new Circle1();

		System.out.println("Area of Circle is " + c.areaOfCircle(3.5f, 12));
		System.out.println("Circumference of Circle " + c.cicumOfCircle(4));
	}

}
