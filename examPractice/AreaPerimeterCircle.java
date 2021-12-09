package examPractice;

import java.util.Scanner;

public class AreaPerimeterCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle ");
		radius = sc.nextInt();
		
		int area = (int) (Math.PI*(radius*radius));
		int perimeter = (int) (2*(Math.PI*(radius)));
		
		System.out.println("Area of cicle is :"+area);
		System.out.println("Area of cicle is :"+perimeter);
		
		

	}

}
