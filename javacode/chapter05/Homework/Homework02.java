public class Homework02 {
	public static void main(String[] args) {

		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		int arrTemp[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {			
			arrTemp[i] = arr[i];
		}

		System.out.println("生成的随机数组为：");
		for(int i = 0; i < arr.length; i++) {			
			System.out.print(arr[i] + " ");
		}
		
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
				}
			}
		}

		for(int i = 0; i < arrTemp.length; i++) {
			if(arrTemp[i] == arr[0]) {
				System.out.println("\n最大值 = " + arr[0]);
				System.out.println("最大值下标 = " + i);	
			}			
		}
		for(int i = 0; i < arrTemp.length; i++) {			
			if(arrTemp[i] == arr[9]) {
				System.out.println("最小值 = " + arr[9]);
				System.out.println("最小值下标 = " + i);	
			}
		}

		int n = -1;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {			
			if(arr[i] == 8) {
				System.out.println("随机数中有8");
				n++;					
			}
			sum = sum + arr[i];
		}
		if(n == -1) {
				System.out.println("随机数中没有8");									
			}

		System.out.println("平均值 = " + sum / 10);

		System.out.println("倒序排列：");
		for(int i = 0; i < arr.length; i++) {			
			System.out.print(arr[i] + " ");
		}

	}
}