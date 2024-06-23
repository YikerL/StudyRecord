//升序数组插入一个数，要求还是升序排列
import java.util.Scanner;
public class Homework01 {
	public static void main(String[] args) {

		int arr[] = {10, 12, 45, 90};
		int arrNew[] = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}  
		arr = arrNew;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入要插入的元素");
		int insert = myScanner.nextInt();
		
		for(int i = arr.length - 1,j = 0 ; i >= 0 && j < arr.length - 1; i--,j++) {			
			arr[arr.length - 1 - j] = insert;
			if(arr[arr.length - 1 - j] < arr[arr.length - 2 - j]) {
				arr[arr.length - 1 - j] = arr[arr.length - 2 - j] ;
				arr[arr.length - 2 - j] = insert;
				//如果插入的元素小于原数组最大值，开始从后往前比较大小确定位置
			} else if(arr[arr.length - 1 - j] >= arr[arr.length - 2 - j]) {							
				break;
				//如果插入的元素大于原数组的最大值，直接将其插在后面
			}						
		} 

		for(int i = 0; i < arr.length; i++) {			
			System.out.print(arr[i] + " ");
		}

	}
}