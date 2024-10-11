package field;

public class snack {
	String kind;
	String name;
	int count;
	int price;
	snack(String kind) {
		this(kind,"새우깡",2,3500);
	}
	snack(String kind, String name) {
		this(kind,name, 2, 3500);
	}
	snack(String kind, String name, int count) {
		this(kind,name, count, 3500);
	}
	snack(String kind, String name, int count, int price) {
		this.kind = kind;
		this.name = name;
		this.count = count;
		this.price = price;
	}
}
