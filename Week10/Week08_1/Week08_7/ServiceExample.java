package Week08_7;

public class ServiceExample {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		
		service.defaultMethod1();
		System.out.println();
		service.defaultMethoe2();
		System.out.println();
		
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	}

}
