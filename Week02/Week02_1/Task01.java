package homework01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int score = s.nextInt();
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}
}