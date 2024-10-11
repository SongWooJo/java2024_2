package field;

public class personExample {

	public static void main(String[] args) {
		person p1 = new person("조성우");
		System.out.println("p1.name : " + p1.name);
		System.out.println();
		
		person p2 = new person("조성우",23);
		System.out.println("p2.name : " + p2.name);
		System.out.println("p2.age : " + p2.age);
		System.out.println();
		
		person p3 = new person("조성우",23,true);
		System.out.println("p3.name : " + p3 .name);
		System.out.println("p3.age : " + p3.age);
		System.out.println("p3.sex : " + p3.sex);
		System.out.println();
		
		person p4 = new person("조성우",23,true,65);
		System.out.println("p4.name : " + p4 .name);
		System.out.println("p4.age : " + p4.age);
		System.out.println("p4.sex : " + p4.sex);
		System.out.println("p4.weihgt : " + p4.weight);
		System.out.println();
		
		person p5 = new person("조성우",23,true,65,178);
		System.out.println("p5.name : " + p5 .name);
		System.out.println("p5.age : " + p5.age);
		System.out.println("p5.sex : " + p5.sex);
		System.out.println("p5.weihgt : " + p5.weight);
		System.out.println("p5.height : " + p5.height);
		System.out.println();

	}

}
