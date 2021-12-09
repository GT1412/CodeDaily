package examPractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number ; 
		System.out.println("Enter a Number :");
		number = sc.nextInt();
		
		if(number %2 == 0)
		{
			System.out.println("Ëven Number ");
		}
		else
		{
			System.out.println("Odd Number ");
		}
	} 

}
