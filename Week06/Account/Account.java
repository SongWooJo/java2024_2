package Account;

public class Account {
	private int balance;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	public int getbalance() {
		return balance;
	}
	
	public void setbalance(int balance) {
		if(this.balance+balance<MIN_BALANCE) {
			return;
		} else if(this.balance+balance>MAX_BALANCE) {
			return;
		} else {
			this.balance += balance;
		}
	}
}
