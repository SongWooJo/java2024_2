package week09_1_1;

public class A {
	class B {}
	
	B field = new B();
	
	A() {
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}