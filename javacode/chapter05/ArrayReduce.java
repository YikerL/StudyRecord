//对数组进行缩减

import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};
		Scanner myScanner = new Scanner(System.in);
		do {
			int temp[] = new int[arr.length - 1];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
			System.out.print("缩减后的arr:");
			arr = temp;
			for(int i = 0; i < temp.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.print('\n');	
			System.out.println("是否继续缩减y/n:");
			char key = myScanner.next().charAt(0);
			if (key == 'y') {
				if(arr.length == 1) {
					System.out.println("不能再缩减");
					break;
				}
				continue;
			}
		} while(true);

	}
}