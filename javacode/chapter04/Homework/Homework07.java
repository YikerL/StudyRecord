

public class Homework07 {
	public static void main(String[] args) {

		int sum = 0;
		int sum1 = 0;
		for(int i = 1; i <= 100; i++) {
			 sum = sum + i;
			 //System.out.println("sum = " + sum);
			 sum1 = sum1 + sum; 
		}
		System.out.println("sum1 = " + sum1);

	}
}