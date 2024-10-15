package homework1.model;

public class Employee extends Person{
	private String[][] Employee = new String[10][6];
	int count = 1;
	protected int salary;
	protected String dept;
	
	public void setEmployee(String name, int age, double height, double weight, int salary, String dept) {
		super.setPerson(name);
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
		this.dept = dept;
		Employee[count-1][0] = name;
		Employee[count-1][1] = String.valueOf(age);
		Employee[count-1][2] = String.valueOf(height);
		Employee[count-1][3] = String.valueOf(weight);
		Employee[count-1][4] = String.valueOf(salary);
		Employee[count-1][5] = dept;
		count++;
	}
	
	public void getEmployee(int i) {
		System.out.print(Employee[i][0]);
		System.out.print(" ");
		System.out.print(Employee[i][1]);
		System.out.print(" ");
		System.out.print(Employee[i][2]);
		System.out.print(" ");
		System.out.print(Employee[i][3]);
		System.out.print(" ");
		System.out.print(Employee[i][4]);
		System.out.print(" ");
		System.out.println(Employee[i][5]);
	}
}
