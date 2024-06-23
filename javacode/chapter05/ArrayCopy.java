//数组拷贝
//

public class ArrayCopy {
	public static void main(String[] args) {

		int arr1[] = {10, 20, 30};

		//创建一个新的数组，开辟新的数据空间
		int arr2[] = new int[arr1.length];
		//遍历每个元素拷贝到arr2中
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		arr2[0] = 77;
		System.out.print('\n');
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);

	}
}