package Week14_7;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);

	}

}
