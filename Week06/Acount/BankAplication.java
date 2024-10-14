package Acount;

import java.util.Scanner;

public class BankAplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Acount a = new Acount();
		int count = 0;
		
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
				String balance = s.nextLine();
				a.setbalance(number,username,balance);
				count++;
				System.out.println("결과: 계좌가 생성되었습니다.");
				
			} else if(select.equals("2")) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				for(int i=0;i<count;i++) {
					for(int j=0;j<3;j++) {
						System.out.print(a.getbalance(i,j)+" ");
					}
					System.out.println();
				}
				System.out.println();
			} else if(select.equals("3")) {
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String newnumber = s.nextLine();
				for(int i=0;i<count;i++) {
					if(a.getbalance(i,0).equals(newnumber)) {
						System.out.print("얼마를 입금하시겠습니까?:");
						String price = s.nextLine();
						a.plus(i,price);
						System.out.println("입금 완료");
					}
				}
			} else if(select.equals("4")) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String newnumber = s.nextLine();
				for(int i=0;i<count;i++) {
					if(a.getbalance(i,0).equals(newnumber)) {
						System.out.print("얼마를 출금하시겠습니까?:");
						String price = s.nextLine();
						a.minus(i,price);
						System.out.println("출금 완료");
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