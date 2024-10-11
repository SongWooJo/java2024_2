package field;

public class petExample {

	public static void main(String[] args) {
		pet p1 = new pet("푸들");
		System.out.println("p1.kind : " + p1.kind);
		System.out.println();
		
		pet p2 = new pet("푸들","멍멍이");
		System.out.println("p2.kind : " + p2.kind);
		System.out.println("p2.name : " + p2.name);
		System.out.println();
		
		pet p3 = new pet("푸들","멍멍이",5);
		System.out.println("p3.kind : " + p3.kind);
		System.out.println("p3.name : " + p3.name);
		System.out.println("p3.age : " + p3.age);
		System.out.println();
		
		pet p4 = new pet("푸들","멍멍이",5,6);
		System.out.println("p4.kind : " + p4.kind);
		System.out.println("p4.name : " + p4.name);
		System.out.println("p4.age : " + p4.age);
		System.out.println("p4.weihgt : " + p4.weight);
		System.out.println();
		
		pet p5 = new pet("푸들","멍멍이",5,6,13);
		System.out.println("p5.kind : " + p5.kind);
		System.out.println("p5.name : " + p5.name);
		System.out.println("p5.age : " + p5.age);
		System.out.println("p5.weihgt : " + p5.weight);
		System.out.println("p5.height : " + p5.height);
		System.out.println();


	}

}
