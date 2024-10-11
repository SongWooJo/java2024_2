package homework01;

import java.util.Scanner;

public class homework06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("--------------------------------------");
		int select = 0;
		int student = 0;
		int[] score = null;
		int max = 0;
		int sum = 0;
		while(select !=5) {
			System.out.print("선택> ");
			select = s.nextInt();
			if(select == 1) {
				System.out.print("학생수> ");
				student = s.nextInt();
				score = new int[student];
			}
			if(select == 2) {
				for(int i=0;i<student;i++) {
					System.out.print("scores["+i+"]>");
					score[i] = s.nextInt();
					if(max<score[i]) {
						max = score[i];
					}
					sum += score[i];
				}
			}
			if(select == 3) {
				for(int i=0;i<student;i++) {
					System.out.println("scores["+i+"]: "+score[i]);
				}
			}
			if(select == 4) {
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + sum/student);
			}
			if(select == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");
		};

	}

}
