//多重循环练习--九九乘法表

import java.util.Scanner;

public class MultForExercise02 {
	
	public static void main(String[] args) {

		int a = 1;
		int b ;
		for( ; a <= 9 ; a++) {
			for(b=1 ; b <= a ; b++) {
				System.out.print(b + "x" + a + "=" + a * b + '\t');
			}
			System.out.println('\n');
		}

	}
}