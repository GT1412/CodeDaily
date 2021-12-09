package examPractice;

import java.util.Scanner;

public class EquilaterTriangle {
	public static void main(String[ ] args)
	{
		double side;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side : ");
		side = sc.nextDouble();
		
		double area = (1.73*side*side)/4;
		System.out.println("Area OF Equilateral Triangle is " +area );
		
	}

}
