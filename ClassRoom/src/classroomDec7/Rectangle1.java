package classroomDec7;

public class Rectangle1 {
	int length, breadth;

	Rectangle1() {
		length = 0;
		breadth = 0;

	}

	Rectangle1(int side) {

		this.length = side;
		this.breadth = side;
	}

	Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	void area() {
		int area = length * breadth;
		System.out.println("Area is : " + area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 r1 = new Rectangle1();
		new Rectangle1().area();
		new Rectangle1(12).area();
		new Rectangle1(10, 20).area();
	}

}
