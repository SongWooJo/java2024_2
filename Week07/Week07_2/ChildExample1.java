package Week07_2;

public class ChildExample1 {

	public static void main(String[] args) {
		Parent1 parent = new Child1();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 *parent.field2 = "data2"; //불가능
		 *parent.method3(); //불가능
		 */
		
		//강제 타입 변환
		Child1 child = (Child1) parent;
		child.field1 = "data1";
		child.field2 = "data2";
		child.method2();
		child.method3();

	}

}
