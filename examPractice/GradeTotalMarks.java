package examPractice;

import java.util.Scanner;

public class GradeTotalMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng,mar,sci,math,his;
		System.out.println("Enter the Marks : ");
		System.out.println("English ");
		eng = sc.nextInt();
		System.out.println("Marathi ");
		mar = sc.nextInt();
		System.out.println("Science ");
		sci = sc.nextInt();
		System.out.println("Mathematics ");
		math = sc.nextInt();
		System.out.println("History ");
		his = sc.nextInt();
		
		int total =eng+mar+sci+math+his;
	}

}
