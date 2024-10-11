package field;

public class snackExample {

	public static void main(String[] args) {
		snack p1 = new snack("봉지과자");
		System.out.println("p1.kind : " + p1.kind);
		System.out.println();
		
		snack p2 = new snack("봉지과자","새우깡");
		System.out.println("p2.kind : " + p2.kind);
		System.out.println("p2.name : " + p2.name);
		System.out.println();
		
		snack p3 = new snack("봉지과자","새우깡",2);
		System.out.println("p3.kind : " + p3.kind);
		System.out.println("p3.name : " + p3.name);
		System.out.println("p3.count : " + p3.count);
		System.out.println();
		
		snack p4 = new snack("봉지과자","새우깡",2,3500);
		System.out.println("p4.kind : " + p4.kind);
		System.out.println("p4.name : " + p4.name);
		System.out.println("p4.count : " + p4.count);
		System.out.println("p4.price : " + p4.price);

	}

}
