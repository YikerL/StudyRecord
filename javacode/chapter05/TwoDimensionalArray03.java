public class TwoDimensionalArray03 {
	public static void main(String[] args) {

		int arr[][] = { {4, 6}, {1, 4, 5, 7}, {-2} };
		int sum = 0;
		int i = 0;

		while(i < arr.length) {
			int j = 0;
			while(j < arr[i].length) {
				sum = sum + arr[i][j];
				System.out.println("sum = " + sum);
				j++;
			}
			i++;
		}
		System.out.println("和 = " + sum);

	}
}