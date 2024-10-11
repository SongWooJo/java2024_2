package field;

public class breadExample {

	public static void main(String[] args) {
		bread p1 = new bread("소보루빵");
		System.out.println("p1.kind : " + p1.kind);
		System.out.println();
		
		bread p2 = new bread("소보루빵",2);
		System.out.println("p2.kind : " + p2.kind);
		System.out.println("p2.count : " + p2.count);
		System.out.println();
		
		bread p3 = new bread("소보루빵",2,500);
		System.out.println("p3.kind : " + p3.kind);
		System.out.println("p3.count : " + p3.count);
		System.out.println("p3.cal : " + p3.cal);
		System.out.println();
		
		bread p4 = new bread("소보루빵",2,500,3500);
		System.out.println("p4.kind : " + p4.kind);
		System.out.println("p4.count : " + p4.count);
		System.out.println("p4.cal : " + p4.cal);
		System.out.println("p4.price : " + p4.price);

	}

}
