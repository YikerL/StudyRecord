public class Method02 {
	public static void main(String[] args) {

		//遍历一个数组，输出数组的各个元素值
		int map[][] = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
		int map1[][] = {{0, 0, 0, 1}, {1, 1, 0, 1}, {1, 3, 0, 1}};

		//传统方法
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[0].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println("");
		// }
		//要求再次遍历，只能复制
		//代码冗余度太高
		
		//使用方法完成输出
		Mytools putOut = new Mytools();
		putOut.printMap(map);
		putOut.printMap(map1);
		putOut.printMap(map1);
		//提高代码复用性

	}
}

class Mytools {


	//把输出的功能写到一个类方法中，然后调用即可
	public void printMap(int[][] m) {
		System.out.println("=============");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}
}