package Acount;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Acount a1 = new Acount();
		String[] Account = new String[100];
		int num=0;
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			String select = s.nextLine();
			if(select.equals("1")) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				
				System.out.print("계좌번호:");
				String number = s.nextLine();
				
				System.out.print("계좌주:");
				String username = s.nextLine(); 
				
				System.out.print("초기입금액:");
				int balance = s.nextInt();
				
				Account[num] = number;
				num++;
				Account[num] = username;
				num++;
				
				a1.setbalance(balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
			} else if(select.equals("2")) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				for(int i=0;i<=(num%2);i++) {
					System.out.print(Account[i] +" "+ Account[i+1] +" "+ a1.getbalance());
				}
				System.out.println();
			} else if(select.equals("3")) {
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String newnumber = s.nextLine();
				for(int i=0;i<num-1;i++) {
					String number = Account[i];
					if(newnumber.equals(number)) {
						System.out.print("예금액:");
						int add = s.nextInt();
						a1.setbalance(add);
					} else {
						System.out.println("계좌가 없습니다.");
					}
				}
			} else if(select.equals("4")) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String newnumber = s.nextLine();
				for(int i=0;i<num-1;i++) {
					String number = Account[i];
					if(newnumber.equals(number)) {
						System.out.print("출금액:");
						int minus = s.nextInt();
						a1.setbalance(-minus);
					} else {
						System.out.println("계좌가 없습니다.");
					}
				}
			} else if(select.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
			System.out.println();
		}
	}
}
