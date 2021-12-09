package examPractice;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		number = sc.nextInt();
		int sum = 0;
		while (number > 0) {
			int rem = number % 10;
			sum = sum + rem;
			number = number / 10;

		}
		System.out.println("Sum of Digit is " + sum);

	}
}
