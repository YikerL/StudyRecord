//创建一个下面这样的数组
//       1
//       2 2
//       3 3 3

public class TwoDimensionalArray02 {
	public static void main(String[] args) {

		int arr[][] = new int[3][];
		//创建二维数组，但是只确定一维数组的个数
		//每个一维数组还没有开空间      
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			//给每一个一维数组开空间
			//如果没有new，那么arr[i]就是null
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;//赋值：把元素放到开好的空间
			}
		}

  		//输出
  		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
}