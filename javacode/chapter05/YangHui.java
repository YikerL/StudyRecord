public class YangHuiTriangle {
	public static void main(String[] args) {

		int line = 7;//打印多少行的杨辉三角
		int triangle[][] = new int[line][];
		
		for(int i = 0; i < line; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][1] = 1;
			triangle[i][triangle[i].length - 1] = 1;
			for(int j = 1; j < triangle[i].length - 1; j++) {
				triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
			}
		} 

		for(int i = 0; i < triangle.length; i++) {
			for(int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j]);
			}
			System.out.println("");
		}
	
	}
}