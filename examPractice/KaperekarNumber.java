package examPractice;

import java.util.Scanner;

public class KaperekarNumber {

	public static void main(String[] args) {
		int number, digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		number = sc.nextInt();
		int square = number * number;
		int temp = square;

		int length = 0;
		while (square != 0) {

			length++;
			square = square / 10;
			System.out.println("Length" + length);

		}
		int left = 0;
		int right = 0;
		int j = 0;
		for (int i = 0; i < length; i++) {
			left = (int) (square / Math.pow(10, i));
			right = (int) (square % Math.pow(10, i));

			if (left + right == number)

			{
				System.out.println("Kaprekar Number ");
				j++;
				break;
			}
			if (j == 0) {
				System.out.println("Not a Kaperekar");
			}
		}
	}
}
