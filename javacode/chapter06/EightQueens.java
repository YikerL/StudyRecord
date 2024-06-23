public class EightQueens {
	public static void main(String[] args) {

		int board[][] = new int[8][8];
		int x[] = {0, 1, 2, 3, 4, 5, 6, 7};
		int y[] = {0, 1, 2, 3, 4, 5, 6, 7};
		//打印棋盘
		for(int i = 0; i < board.length; i++) {
			
			for(int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		Chess c1 = new Chess();
		c1.place(board, x, y, 1, 1);


		System.out.println("================");
		for(int i = 0; i < board.length; i++) {
			
			for(int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

}
	

class Chess {

	//8*8棋盘上放八个皇后，不能在同一条/同一列/同一条斜线上
	//有多少种摆法
	//分析：
	//1.第一个棋子的位置(i.j)
	//2.不在同一行 i1 != i2 != i3 != in
	//3.不在同一列 j1 != j2 != j3 != jn
	//4.不在一条斜线 i1+j1 != in+jn
	//5.满足要求的位置2 ；未达到的位置0 ；去过但不满足要求的位置为1
	//
	public boolean place(int[][] board,int x[],int y[],int i,int j) {
		if(i == 7 ) {
			return false;
		}
		if(j == 7) {
			return false;
		}

		board[x[i]][y[j]] = 2;

		if(x[i] + y[j] != x[i-1] + y[i-1]) {
		//if(x[i] != x[i+1] && y[j] != y[j+1] && x[i] + y[j] != x[i+1] + y[i+1]) {
			if(place(board, x, y, i, j-1)) {
				return true;
			} else if(place(board, x, y, i, j+1)) {
				return true;
			// } else if(place(board, x, y, i-1, j)) {
			// 	return true;
			// } else if(place(board, x, y, i, j+1)) {
			// 	return true;
			} else {
				board[x[i]][y[j]] = 1;
				return false;
			}
			
		} else {
			return false;
		}

	}
}