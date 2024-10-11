package field;

public class houseExample {

	public static void main(String[] args) {
		house p1 = new house("아파트");
		System.out.println("p1.kind : " + p1.kind);
		System.out.println();
		
		house p2 = new house("아파트",3);
		System.out.println("p2.kind : " + p2.kind);
		System.out.println("p2.room : " + p2.room);
		System.out.println();
		
		house p3 = new house("아파트",3,2);
		System.out.println("p3.kind : " + p3.kind);
		System.out.println("p3.room : " + p3.room);
		System.out.println("p3.toilet : " + p3.toilet);
		System.out.println();
		
		house p4 = new house("아파트",3,2,false);
		System.out.println("p4.kind : " + p4.kind);
		System.out.println("p4.room : " + p4.room);
		System.out.println("p4.toilet : " + p4.toilet);
		System.out.println("p4.ground : " + p4.ground);

	}

}
