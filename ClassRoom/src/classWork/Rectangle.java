package classWork;

import java.util.Scanner;

public class Rectangle {
	static // Create a class Rectangle with two instance variables: length and width.
			// Create a constructor initialing the instance
//	variables.Subsequently, two objects of this class are created and then the methods rectangleArea() and
//	rectanglePerimeter() areinvoked. (Variations)

	int length;
	static int width;

	Rectangle() {
		this.length = length;
		this.width = width;

	}

	void rectangleArea() {

		int area = length * width;
		System.out.println("Area is : " + area);
	}

	void rectanglePerimeter() {
		int peri = (2 * (length * width));
		System.out.println("Perimeter " + peri);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length ");
		length = sc.nextInt();

		System.out.println("Enter the width");
		width = sc.nextInt();
		Rectangle r1 = new Rectangle();

		r1.rectangleArea();
		r1.rectanglePerimeter();

	}
}
