package examPractice;

import java.util.Scanner;

public class compoundIntrest {

	public static void main(String[] args) {
		double rate;
		int principle, time;
		double ci;
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount ");
		principle = sc.nextInt();
		System.out.println("Rate ");
		rate = sc.nextInt();
		System.out.println("Time ");
		time = sc.nextInt();

		rate = (1 + rate / 100);
		rate = Math.pow(rate, time);
		amount = principle * rate;

		System.out.println("Amount is "+amount);
		ci = amount - principle;
		System.out.println("Compound intrest is : " + ci);

	}
}
