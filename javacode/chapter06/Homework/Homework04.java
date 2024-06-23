
public class Homework04 {
	public static void main(String[] args) {

		int arr[] = {5, 4, 6, 3, 7};
		A04 a1 = new A04();
		int a1Arr[] = a1.copyArr(arr);
		for(int i = 0; i < a1Arr.length; i++) {
			System.out.print(a1Arr[i] + " ");
		}
	}
}

class A04 {

	public int[] copyArr(int[] oldArr) {
		int newArr[] = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}