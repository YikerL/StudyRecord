//数组反转

public class ArrayReverse {
	public static void main(String[] args) {

		//方法一：逆序赋值
		int arr[] = {11, 22, 33, 44, 55, 66};
		int bridge[] = new int[arr.length];
		
		//逆序遍历
		// for(int i = 0; i < arr.length; i++) {
		// 	bridge[arr.length - i - 1] = arr[i];
		// }
		for(int i = 0, j = arr.length - 1; i < arr.length; i++ , j--) {
			bridge[j] = arr[i];
		}//在for里面增加一个循环变量，让代码可读性更高

		
		// for(int i = 0; i < arr.length; i++) {
		// 	arr[i] = bridge[i];
		// }
		arr = bridge;//两个数组指向同一个地址//比上面的for循环简单

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


		//方法二：找规律反转
		// int arr[] = {11, 22, 33, 44, 55, 66, 77};
		// int temp;//定义一个临时变量
		// for(int i = 0; i < arr.length / 2; i++) {
		// 	temp = arr[1];
		// 	arr[1] = arr[arr.length - 1 - i];
		// 	arr[arr.length - 1 - i] = arr[1];
		// }
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }


	}
}