//方法细节
public class MethodDetails {
	public static void main(String[] args) {

		AA res = new AA();
		int arr1[] = res.getSumAndSub(10, 5);
		System.out.print(arr1[0] + " " + arr1[1]);
	}
}


//1.一个方法最多一个返回值[如何返回多个结果：数组]

class AA {
	public int[] getSumAndSub(int n1, int n2) {
		int resArr[] = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
}