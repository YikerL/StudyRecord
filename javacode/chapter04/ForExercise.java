//for练习
//
public class ForExercise {
	public static void main(String[] args) {
 
  		int i;
  		int count = 0;//统计个数的变量
  		int sum = 0; 
  		int start = 10;
  		int end = 200;
  		int t = 9;
		for(i = start ; i <= end ; i++) {
			if(i % t == 0) {
				System.out.println(i);								
				count++;
				sum = sum + i;							
			}			
		}
		System.out.println("总共有" + count +"个数");
		System.out.println("它们的和为" + sum);
	

		int m = 0;
		int n = 5;
		int p = 9;
		for(; m <= p ; m++ , n--) {
			System.out.println(m + " + " + n + " = " + (m + n));
		}

	}
}