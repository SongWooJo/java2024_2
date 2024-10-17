package Week07_2_2;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); //abstract는 객체를 만들 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
