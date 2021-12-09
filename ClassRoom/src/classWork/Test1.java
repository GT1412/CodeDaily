package classWork;

public class Test1 {
//	Create a class Test with constructors to initialize the variables and methods to perform the following tasks. Give
//	appropriate arguments to methods. Methods should perform following programs:
//	a.Even odd
//	b. Factorial of a number using do-while loop. c.Find sum of all digits of a number
	long number;
	
	Test1(int number) {
		this.number = number;

	}

	void EvenOdd() {
		
		if (number % 2 == 0) {
			System.out.println("Even ");
		} else {
			System.out.println("Odd  ");
		}

	}

	void factorial() {
		
		long fact = 1;
		do {
			fact = fact * number;
			number--;
		} while (number > 0);

		System.out.println("Factorial : " + fact);
	}

	void Sum(int number) {
		long sum = 0;
		while (number > 0) {
			long rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		System.out.println("Sum of digit is : "+sum);

	}
	public static void main(String [] args)
	{
		Test1 t1 = new Test1(5);
		t1.EvenOdd();
		t1.factorial();
		t1.Sum(15);
	}
}
