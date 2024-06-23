////////////////
//do while 循环练习 //
////////////////

import java.util.Scanner;

public class DoWhileExercise01 {
	public static void main(String[] args) {
   
		// int start = 1;
		// int end = 100;	
		// int i = start;
		// do {
		// 	System.out.println(i);	
		// 	i++;
		// } while(i <= end);


		//计算1到100的和
		// int start = 1;
		// int end = 100;
		// int sum = 0;		
		// int i = start;
		// do {
		// 	System.out.println(i);
		// 	sum = sum + i;
		// 	i++;
		// } while(i <= end);
		// System.out.println(sum);


		//1到200之间能被5整除但不能被3整除的数
		// int start = 1;
		// int end = 200;
		// int count = 0;
		// int t1 = 3;
		// int t2 = 5; 
		// int i = start;
		// do {
		// 	if(i % t1 == 0 && i % t2 != 0) {
		// 		count++;
		// 	}
		// 	i++;
		// } while(i <= end);
		// System.out.println(count);
		 
		
		 
		// 要钱，不给就打，打到换为止		
		
		Scanner myscanner = new Scanner(System.in);	
		char answer = ' ';
		do {
			System.out.println("还钱吗？");
			answer = myscanner.next().charAt(0);
		} while(answer != 'y');


	}
}