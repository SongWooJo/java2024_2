package week09_1_7;

public class A {
	public void method1(int arg) {
		int var = 1;
		
		class B{
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
			}
		}
		
		B b = new B();
		
		b.method2();
	}
}
