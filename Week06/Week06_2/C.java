package Week06_2;

import Week06_1.*;

public class C {
	//필드 선언
	A a1 = new A(true); //o, public은 다른 패키지도 사용 가능
	//A a2 = new A(1); //x, default는 같은 패키지에서만 사용 가능
	//A a3 = new A("문자열"); //x, private는 객체 내부에서만 사용 가능
}
