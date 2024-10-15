package Week07_1_1;

import Week07_1.A;

public class D extends A{
	//생성자 호출 가능
	public D() {
		super();
	}
	
	//필드값 변경 및 호출 가능
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	//직접 객체 생성 안됨
	public void method2() {
		//A a = new A();
		//a.field = "value";
		//a.method();
	}
}
