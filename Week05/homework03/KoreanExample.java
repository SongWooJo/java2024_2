package homework03;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "감자바");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final 필드는 실행으로는 값을 바꿀수없다.
		//k1.nation = "USA";
		//k1.ssn = "123-12-1234";
		
		//final 필드가 아니면 실행으로 값 변경 가능.
		k1.name = "김자바";
				

	}

}
