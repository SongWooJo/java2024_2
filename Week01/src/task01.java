
public class task01 {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		System.out.println("result3: " + result3);
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8 /4;
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("result7: " + result7);
		
		int a = 3;
		char b = 'A';
		String c = "Code";
		System.out.printf("a=%d %n",a);
		System.out.printf("b=%c %n",b);
		System.out.printf("c=%s %n",c);
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (534/30);
		System.out.println(pencilsPerStudent);
		//남은 연필 수
		int pencilsLeft = (534%30);
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value - value%100 );
		
		int x = 10;
		int y = 5;
		System.out.println( (x>7) && (y<=5) );
		System.out.println( (x%3 == 2) || (y%2 != 1) );
		
		double y1 = 0.0;
		double z = 5 % y1;
		if (y1==0) {
		   System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
		   double result11 = z + 10;
		   System.out.println("결과: " + result11);
		}

	}

}
