package examPractice;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
int number ;
Scanner sc  = new Scanner(System.in);
System.out.println("Enter a Number ");
number = sc.nextInt();
int count = 0;

while(number!=0)
{
	number = number/10;
	count++;
}
System.out.println("Count Digits in Number Are "+count);
	}

}
