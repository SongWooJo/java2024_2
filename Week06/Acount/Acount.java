package Acount;

public class Acount {
	private String[][] balance = new String[100][3];
	
	int count= 1;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	public void setbalance(String number, String username, String balance) {
		this.balance[count-1][0] = number;
		this.balance[count-1][1] = username;
		this.balance[count-1][2] = balance;
		count++;
	}
	
	public String getbalance(int a,int b) {
		return this.balance[a][b];
	}
	
	public void plus(int a,String price) {
		int balance = Integer.parseInt(this.balance[a][2]);
		int P = Integer.parseInt(price);
		if(balance+P>MAX_BALANCE) {	
			balance = MAX_BALANCE;
		} else {
			balance = balance+P;
		}
		this.balance[a][2] = String.valueOf(balance);
	}
	
	public void minus(int a,String price) {
		int balance = Integer.parseInt(this.balance[a][2]);
		int P = Integer.parseInt(price);
		if(balance-P<MIN_BALANCE) {	
			balance = MIN_BALANCE;
		} else {
			balance = balance-P;
		}
		this.balance[a][2] = String.valueOf(balance);
	}
}
	