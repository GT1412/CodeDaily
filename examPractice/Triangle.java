package examPractice;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		int year;
		System.out.println("Enter the Year You Want to Check");
		Scanner sc =new Scanner(System.in);
		year = sc.nextInt();
		
		if (year %100==0 && year %400!=0 )
		{
			System.out.println("Leap Year ");
		}
		else if( year%4==0)
		{
			System.out.println("Leap Year");
		}
		else 
			System.out.println("Not a Leap year ");
	}

}
