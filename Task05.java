package homework01;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		String inputString;
		do {
			System.out.print(">");
			inputString = s.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
