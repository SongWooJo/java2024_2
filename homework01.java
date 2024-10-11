package homework01;

public class homework01 {

	public static void main(String[] args) {
		for(int x=1;x<=100;x++) {
			if(x*x-9*x+14!=0) {
				continue;
			}
			
			System.out.print(x + " ");
		}
	}

}
