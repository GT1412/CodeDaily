package classroomDec7;

public class Program {
	String name;
	int id, gross, basic, hra, da;

	Program(String name, int id, int basic, int hra, int da) {
		this.name = name;
		this.id = id;
		this.basic = basic;
		this.hra = hra;
		this.da = da;

	}

	int calculateSalary() {
		return (gross = basic + hra + da);

	}

	void display() {
		this.calculateSalary();
		System.out.println("Name " + name + " id " + id + " Salary " + gross);
	}

	public static void main(String[] args) {
		new Program("Priya ", 101, 20000, 678, 999).display();
	}

}
