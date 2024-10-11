package Account;

public class AccountExample {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.setbalance(10000);
		System.out.println("현재 잔액: " +  a.getbalance());
		
		a.setbalance(1000000);
		System.out.println("현재 잔액: " + a.getbalance());
		
		a.setbalance(20000);
		System.out.println("현재 잔액: " + a.getbalance());

	}

}
