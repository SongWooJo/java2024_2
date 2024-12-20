package Week14_4;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable< >();
		
		Thread  threadA = new Thread() {
			public void run() {
				for (int i=1; i<=1000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for (int i=1001;i<=2000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될  때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			
		}
		
		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
		System.out.println();

	}

}
