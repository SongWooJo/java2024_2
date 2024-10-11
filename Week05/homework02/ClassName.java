package homework02;

public class ClassName {
	int field1;
	void method1() {
	}
	static int field2;
	static void method2() {
	}
	//그냥 선언 안됨
	static {
		//field1=10;
		//method1();
		field2=10;
		method2();
	}
	//this 선언 안됨
	static void Method3() {
		//this.field1 =10;
		//this.method1();
		field2=10;
		method2();
	}
	//사용하려면 이런 식으로 객체를 먼저 생성하고 사용
	static void Method4() {
		ClassName obj = new ClassName();
		obj.field1=10;
		obj.method1();
	}
}
