package Week07_1;

public class B {
	public void method() {
		//같은 패키지 안에서는 다 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
