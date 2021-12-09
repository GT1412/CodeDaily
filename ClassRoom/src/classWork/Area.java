package classWork;

public class Area {
	int length, width;

	public Area() {
		length = 12;
		width = 5;
	}

	void RectangleArea() {
		int Area = length * width;
		System.out.println("Area : " + Area);

	}

	void RectanglePerimeter() {
		int perimeter = 2 * (length * width);
		System.out.println("Perimeter " + perimeter);

	}
	public static void main(String[] args)
	{
		Area a1 = new Area ();
		a1.RectangleArea();
		a1.RectanglePerimeter();
	}

}
