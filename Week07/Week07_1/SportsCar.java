package Week07_1;

public class SportsCar extends Car{
	public void speedUp() {
		speed += 10;
	}

	//오버라이딩 안됨
	/*
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	 */
}
