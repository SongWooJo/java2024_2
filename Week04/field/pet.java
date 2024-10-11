package field;

public class pet {
	String kind;
	String name;
	int age;
	int weight;
	int height;
	pet(String kind) {
		this(kind,"멍멍이",5,6,13);
	}
	pet(String kind,String name) {
		this(kind,name,5,6,13);
	}
	pet(String kind, String name, int age) {
		this(kind, name,age,6,13);
	}
	pet(String kind, String name, int age, int weight) {
		this(kind,name,age,weight,13);
	}
	pet(String kind, String name, int age, int weight, int height) {
		this.kind = kind;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

}
