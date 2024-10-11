package field;

public class person {
	String name;
	int age;
	boolean sex;
	int weight;
	int height;
	person(String name) {
		this(name,20,true,65,178);
	}
	person(String name, int age) {
		this(name,age,true,65,178);
	}
	person(String name, int age, boolean sex) {
		this(name,age,sex,65,178);
	}
	person(String name, int age, boolean sex, int weight) {
		this(name,age,true,65,178);
	}
	person(String name, int age, boolean sex, int weight, int height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}

}
