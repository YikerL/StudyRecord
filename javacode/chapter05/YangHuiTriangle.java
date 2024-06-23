public class YangHuiTriangle {
	public static void main(String[] args) {

		int line = 10;//打印多少行的杨辉三角
		int triangle[][] = new int[line][];//开辟二维数组空间
		
		for(int i = 0; i < line; i++) {
			triangle[i] = new int[i + 1];//给每个一维数组开辟空间
			triangle[i][0] = 1;//每行第一个数是1
			triangle[i][triangle[i].length - 1] = 1;//每行最后一个数是1
			//赋值
			for(int j = 1; j < triangle[i].length - 1; j++) {
				triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
			}   //中间的数等于肩膀上两个数的和
		} 

		//打印
		for(int i = 0; i < triangle.length; i++) {
			for(int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println("");
		}
	
	}
}