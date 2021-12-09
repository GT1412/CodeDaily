package examPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number, next, privious, i, count;
		Scanner sc = new Scanner(System.in);
		privious = 0;
		next = 1;
		System.out.println("Count ");
		count = sc.nextInt();

		for (i = 2; i < count; i++) {
			number = privious + next;
			System.out.println(" " + number);
			privious = next;
			next = number;

		}

	}

}
