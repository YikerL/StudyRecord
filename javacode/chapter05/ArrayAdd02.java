//对数组进行动态扩容

import java.util.Scanner;

public class ArrayAdd02 {
	public static void main(String[] args) {

		int arr[] = {1, 2, 3};	
		Scanner myScanner = new Scanner(System.in);					

		for(int k = 0; k >= 0; k++) {  //使用一个死循环，可以用 do while
			int arrNew[] = new int[arr.length + 1];

			System.out.println("请输入要增加的元素:");
			int input = myScanner.nextInt();					
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[arrNew.length - 1] = input;

			System.out.print("扩容成功，扩容后的arr:");
			arr = arrNew; 
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.print('\n');
			System.out.print("是否继续扩容y/n:");
			char answer = myScanner.next().charAt(0);
			if(answer == 'y') {
				continue;
			} 
			else {
				System.out.println("结束");
				break;
			}
			

		}
		// System.out.print("扩容成功，是否继续扩容y/n");
		// char answer = myScanner.next().charAt(0);
		// if(answer == 'y') {
		// 	System.out.print("请输入要增加的元素:");
		// 	int input = myScanner.nextInt();
		// 	for(int i = 0; i < arr.length; i++) {
		// 		arrNew[i] = arr[i];
		// 	}
		// 	arrNew[arrNew.length - 1] = input;

		// 	System.out.print("扩容后的arr:");
			
		// 	arr = arrNew; 
		// 	for(int i = 0; i < arr.length; i++) {
		// 		System.out.print(arr[i] + " ");
		// 	}
		// } else {
		// 	System.out.print("结束");
		// }

	}
}