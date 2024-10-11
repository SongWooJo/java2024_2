package field;

public class bread {
	String kind;
	int count;
	int cal;
	int price;
	bread(String kind) {
		this(kind,2,500,3500);
	}
	bread(String kind, int count) {
		this(kind,count, 500, 3500);
	}
	bread(String kind, int count, int cal) {
		this(kind, count, cal, 3500);
	}
	bread(String kind, int count,int cal, int price) {
		this.kind = kind;
		this.count = count;
		this.cal = cal;
		this.price = price;
	}

}
