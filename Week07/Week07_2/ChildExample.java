package Week07_2;

public class ChildExample {

	public static void main(String[] args) {
		child child = new child();
		
		parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3();
		parent p = new parent();
		p.method2();
		child.method2();

	}

}
