//求出1-1/2+1/3-1/4.....1/100的和

public class Homework06 {
	public static void main(String[] args) {
		
		int x;
		double sum = 0;
		for(x = 1; x <= 100; x++) {
			if(x % 2 == 1) {
				sum = sum + 1.0 / x;
				//sum = sum + x / x;
			} else if(x % 2 == 0) {
				sum = sum - 1.0 / x;
				//sum = sum - x / x;
			}
		}
		System.out.println(sum);
	}
}