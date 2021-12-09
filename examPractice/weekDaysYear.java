package examPractice;

import java.util.Scanner;

public class weekDaysYear {

	public static void main(String[] args) {
		int year ,week ,days , remaining;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days you want to calculate : ");
		days = sc.nextInt();
		
		year = days/365;
		System.out.println(year+" Years ");
		remaining = days%365;
		week = remaining /7;
		System.out.println(week+" Weeks");
		days = remaining %7;
		System.out.println(days+" Days ");
		

	}

}
