//二维数组快速入门

public class TwoDimensionalArray01 {
	public static void main(String[] args) {

		int arr[][] = { {0, 0, 0, 0, 0, 0},
					    {0, 0, 1, 0, 0, 0},
		                {0, 2, 0, 3, 0, 0},
		                {0, 0, 0, 0, 0, 0} };
		//一维数组的每个元素都是一个数组       
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print('\n');
		}

	}
}