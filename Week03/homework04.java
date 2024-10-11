package homework01;

import java.util.Scanner;

public class homework04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("학생 수를 입력하시오: ");
		int student = s.nextInt();
		
		int[] score = new int[student];
		
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1) + "번째 학생 점수를 입력하시오: ");
			score[i] = s.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		int min = 10000;
		
		for (int i = 0; i < score.length; i++) {
            sum += score[i];
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }

        double average = (double) sum / score.length;

        System.out.println("총합: " + sum);
        System.out.println("평균값: " + average);
        System.out.println("최고점수: " + max);
        System.out.println("최저점수: " + min);

	}

}
