package Que;

import java.util.Scanner;

public class Area {
	int num1, num2, num3, area;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter the number 1");
		num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		num2 = sc.nextInt();
		System.out.println("Enter the number 3");
		num3 = sc.nextInt();

		area(num2);
		area(num1, num2);
		area(num1, num2, num3);
	}

	void area(int side) {
		area = side * side;
		System.out.println("Area of Square : " + area);
	}

	void area(int length, int breadth) {
		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

	void area(int base, int height, int side) {
		area = (int) (0.5f * (base * height));
		System.out.println("Area of Triangle : " + area);
	}

	public static void main(String[] args) {
		Area aa = new Area();
		aa.input();
	}

}
