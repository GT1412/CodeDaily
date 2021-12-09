package classroomDec7;

public class Rectangle {
	int length, width;

	public Rectangle() {
		length = 12;
		width = 87;

	}

	void rectangleArea() {
		int area = length * width;
		System.out.println("Area : " + area);
	}

	void reactanglePerimeter() {
		int peri = 2 * (length + width);
		System.out.println("Perimeter : " + peri);
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.rectangleArea();

		new Rectangle().reactanglePerimeter();

	}

}
