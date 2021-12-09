package classroomDec7;

public class Student {

	String name, deppt;
	int id, gross, basic, hra, da;

	Student(String name, int id, int basic, int hra, int da) {
		this.name = name;
		this.id = id;
		this.basic = basic;
		this.hra = hra;
		this.da = da;

	}

	Student(String name, int id, int basic, int hra, int da, String deppt)

	{
		this(name, id, basic, hra, da);
		this.deppt = deppt;
	}

	int calculateSalary() {
		return (gross = basic + hra + da);

	}

	void display() {
		this.calculateSalary();
		System.out.println("Name " + name + " id " + id + " Salary " + gross + " Dept " + deppt);
	}

	public static void main(String[] args) {
		new Student("Priya ", 101, 20000, 678, 999, " IT ").display();
	}

}
