//迷宫

public class Labyrinth {
	public static void main(String[] args) {

		//创建迷宫，用二维数组表示
		//int map[][] = new int[8][7]
		//八行七列，1表示墙/障碍物，0表示路
		int map[][] = new int[8][7];
		//上下围墙
		for(int i = 0; i < map[0].length; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//左右围墙
		for(int i = 0; i < map.length; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//中间障碍物
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//测试回溯
		//map[][] = 1;

		//打印地图 
		System.out.println("地图如下");
		System.out.println("==============");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============");

		Mouse mouse1 = new Mouse();
		mouse1.way(map, 1, 1);
		System.out.println("找路情况");
		System.out.println("==============");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============");


	}
}

class Mouse {

	//使用递归回溯的思想解决老鼠出迷宫问题
	//1.way方法表示寻找路径
	//2.如果找到返回true
	//3.map[][]表示迷宫
	//4.int i,int j:i和j表示老鼠的位置坐标
	//5.位置(1.1)表示老鼠的初始位置，(6.5)表示迷宫出口
	//6. 0表示可以走 1表示走不通 
	//   2表示可以走 3表示走过，但是走不通是死路
	//7.当(6.5)即map[6][5] = 2时，说明找到通路
	//8.确定老鼠找路的策略 下->右->上->左
	public boolean way(int map[][], int i, int j) {
		
		if(map[6][5] == 2) {
			return true;
		} else {
			
			if(map[i][j] == 0) {
				
				map[i][j] = 2;//假设可以走通，然后开始上下左右试探
				if(way(map, i + 1,j)) {//向下走
					map[i][j] = 2;
					return true;
				} else if(way(map, i, j+1)) {//向右走
					return true;
				} else if(way(map, i-1, j)) {//向上走
					return true;
				} else if(way(map, i, j-1)) {//向左走
					return true;
				} else {
					map[i][j] = 3;
					return false;//假设不成立，走不通
				}
			} else {//map[i][j] = 1/2/3
				return false;
			}
		
		}

	}
}