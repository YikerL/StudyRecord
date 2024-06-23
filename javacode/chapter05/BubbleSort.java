//冒泡排序入门
//

public class BubbleSort {
	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};
		int temp = 0;//辅助交换的变量 
		int count = 0;
		//从小到大排序
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {				
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;//优化，如果原数组本来就是按顺序排列的，直接跳过
				}
			}
			if(count == 0) {
				break;
			}
			System.out.println("\n======第" + (i + 1) + "轮=====");
			for(int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			//System.out.print('\n');
		}		
		System.out.print("\n从小到大排序:");
		for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		

		System.out.print("\n=========================================");			
		//从大到小排序
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {				
				if(arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("\n从大到小排序:");
		for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

	}
}