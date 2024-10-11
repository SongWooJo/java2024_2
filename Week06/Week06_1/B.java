package Week06_1;

public class B {
	A a1 = new A(true); // public이라서 어디서든 사용 가능
	A a2 = new A(1); // default라서 같은 패키지에서 사용 가능
	//A a3 = new A("문자열"); //private라서 사용 불가능
}
