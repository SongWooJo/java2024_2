package homework01;

import java.util.Scanner;

public class homework05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("지원자 수를 입력하시오: ");
		int human = s.nextInt();
		
		int[] sum = new int[human];
		int[] avg = new int[human];
		int max = 0;
		int min = 400;
		int maxhuman = 0;
		int minhuman = 0;
		
		int[][] score = new int[human][4];
		for(int i=0;i<human;i++) {
			System.out.print((i + 1)+"번째 지원자의 인성 점수를 입력하시오: ");
			int in = s.nextInt();
			System.out.print((i + 1)+"번째 지원자의 코딩테스트 점수를 입력하시오: ");
			int co = s.nextInt();
			System.out.print((i + 1)+"번째 지원자의 필기 점수를 입력하시오: ");
			int pil = s.nextInt();
			System.out.print((i + 1)+"번째 지원자의 실기 점수를 입력하시오: ");
			int sil = s.nextInt();
			score[i][0] = in;
			score[i][1] = co;
			score[i][2] = pil;
			score[i][3] = sil;
			sum[i] = in+co+pil+sil;
			avg[i] = sum[i]/4;
			if(max<sum[i]) {
				max = sum[i];
			}
			if(min>sum[i]) {
				min = sum[i];
			}
		}
		for(int j=0;j<human;j++) {
			System.out.println((j+1)+"번째 지원자의 총합은 " +sum[j]+"입니다.");
			System.out.println((j+1)+"번째 지원자의 평균은 " +avg[j]+"입니다.");
			System.out.println();
		}
		
		for(int i=0;i<human;i++) {
			if(sum[i]==max) {
				maxhuman = i+1;
			}
			if(sum[i]==min) {
				minhuman = i+1;
			}
		}
		System.out.println("최고 점수를 받은 사람은 " + maxhuman + "번째 지원자 입니다." );
		System.out.println("최저 점수를 받은 사람은 " + minhuman + "번째 지원자 입니다." );

	}

}
