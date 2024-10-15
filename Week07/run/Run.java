package homework1.run;

import homework1.model.*;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student S1 = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		Student S2 = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		Student S3 = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		S1.getStudent();
		S2.getStudent();
		S3.getStudent();
		
		Employee E = new Employee();
		int sum = 1;
		System.out.print("사원의 이름을 입력하세요.:");
		String name = s.nextLine();
		System.out.print("사원의 나이를 입력하세요.:");
		int age = s.nextInt();
		System.out.print("사원의 신장을 입력하세요.:");
		double height = s.nextDouble();
		System.out.print("사원의 몸무게를 입력하세요.:");
		double weight = s.nextDouble();
		System.out.print("사원의 급여를 입력하세요.:");
		int salary = s.nextInt();
		s.nextLine();
		System.out.print("사원의 부서를 입력하세요.:");
		String dept = s.nextLine();
		E.setEmployee(name,age,height, weight, salary,dept);
		while(true) {
			System.out.println("계속 입력하시려면 y, 그만 입력하려면 n 을 입력하십시오.");
			String choice = s.nextLine();
			if(choice.equals("y")|choice.equals("Y")) {
				System.out.print("사원의 이름을 입력하세요.:");
				name = s.nextLine();
				System.out.print("사원의 나이를 입력하세요.:");
				age = s.nextInt();
				System.out.print("사원의 신장을 입력하세요.:");
				height = s.nextDouble();
				System.out.print("사원의 몸무게를 입력하세요.:");
				weight = s.nextDouble();
				System.out.print("사원의 급여를 입력하세요.:");
				salary = s.nextInt();
				s.nextLine();
				System.out.print("사원의 부서를 입력하세요.:");
				dept = s.nextLine();
				E.setEmployee(name,age,height, weight, salary,dept);
				sum++;
			} else if(choice.equals("n")) {
				break;
			} else {
				System.out.println("다시 입력하시오.");
			}
		}
		for(int i=0;i<sum;i++) {
			E.getEmployee(i);
		}
		

	}

}
