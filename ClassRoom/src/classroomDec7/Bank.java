package classroomDec7;

public class Bank {
	int amount = 5000;
	
	Bank()
	{
		System.out.println("Sorry no amount will Added...");
	}
	Bank(int amount)
	{
		this.amount = this.amount+amount;
	}
	void display() {
		System.out.println("Final Amount : "+amount);
	}

}
