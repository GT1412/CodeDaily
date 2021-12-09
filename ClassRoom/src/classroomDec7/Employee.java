package classroomDec7;

public class Employee {
	float basic, hra, da, grossSalary;
	String name, dept;
	int id, accountnumber;

	public Employee() {
		name = null;
		dept = null;
		id = 0;
		accountnumber = 876;
	}

	public Employee(String name, String dept, int id, int accountnumber, float basic, float hra, float da) {
		this();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.accountnumber = accountnumber;
		this.hra = hra;
		this.da = da;
		this.basic = basic;

	}

	float grossSalary() {
		grossSalary = basic + hra + da;
		return grossSalary;
	}

	void displayData() {
		grossSalary();
		System.out.println("Salary of Employe \n" + name + " " + dept + " " + id + " " + accountnumber + " Salary : "
				+ grossSalary);
	}

	public static void main(String[] args) {

		Employee emp2 = new Employee("Raghav ", "E&T", 123, 020221, 20000, 1233, 1511);

		emp2.displayData();
	}
}
