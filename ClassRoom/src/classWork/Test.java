package classWork;

public class Test {
	
	int number ; 
	
	Test(int number)
	{
		this.number=number;
	}
	
	void EvenOdd()
	{
		if(number%2 ==0)
		{
			System.out.println("Even Number ");
		}
		else
		{
			System.out.println("Odd Number ");
		}
		
	}
	void Factorial()
	{
		 int fact=1 ;
		do
		{	
			fact = fact*number;
			number--;
			
		}
		while (number>0);
		
		System.out.println(fact);
	
		
	}
	void SumOfDigits(int number)
	{
		int rem ,sum = 0;
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("sum of digit is "+sum);
	}
	public static void main(String[] args)
	{
		Test t = new Test(12);
		t.EvenOdd();
		t.Factorial();
		t.SumOfDigits(45);
	}

}
