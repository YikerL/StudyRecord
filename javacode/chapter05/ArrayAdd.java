//数组添加

import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {

		int arr[] = {1, 2, 3};
		int arrNew[] = new int[arr.length + 1];

		Scanner myScanner = new Scanner(System.in);				
		System.out.print("请输入要增加的元素:");
		int input = myScanner.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length - 1] = input;

		arr = arrNew; 

		System.out.print("扩容后的arr:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


	}
}