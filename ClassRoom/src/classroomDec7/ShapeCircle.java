package classroomDec7;

public class ShapeCircle {
	float pi = 3.5f, radius;

	ShapeCircle(float radius) {
		this(2, 3.5f);
		this.radius = radius;
		System.out.println("1St Constructor -->  " + (pi * radius * radius));
	}

	ShapeCircle(float radius, float pi) {
		this.radius = radius;
		System.out.println("2nd Constructor --> " + (pi * radius * radius));
	}
}
