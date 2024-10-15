package homework1.model;

public class Student extends Person{
	protected int grade;
	protected String major;
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super.setPerson(name);
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.grade = grade;
		this.major = major;
	}
	
	public void getStudent() {
		System.out.print(getPerson());
		System.out.print(" ");
		System.out.print(this.age);
		System.out.print(" ");
		System.out.print(this.height);
		System.out.print(" ");
		System.out.print(this.weight);
		System.out.print(" ");
		System.out.print(this.grade);
		System.out.print(" ");
		System.out.println(this.major);
	}
}
