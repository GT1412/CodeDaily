package Que;

import java.util.Scanner;

public class Student {
	String name, contactno;
	int rollno, totalMarks;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter the name ");
		name = sc.next();
		System.out.println("Enter the contact Number of Student :");
		contactno = sc.next();
		System.out.println("Enter the rollNo");
		rollno = sc.nextInt();
		System.out.println("Enter the Total Marks ");
		totalMarks = sc.nextInt();
	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Contact Number : " + contactno);
		System.out.println("Roll Number : " + rollno);
		System.out.println("Total Marks : " + totalMarks);
	
	}
}
