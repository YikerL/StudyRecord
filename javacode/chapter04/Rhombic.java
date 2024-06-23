//空心菱形
//  123456789
//1     *    5    //4个空格
//2    * *   6    //3个空格6
//3   *   *  7    //2个空格7
//4  *     * 8    //1个空格8
//5 *       *9    //0个空格
//6  *     * 8    //1个空格8 line-1
//7   *   *  7    //2个空格7 line-2
//8    * *   6    //3个空格6 line-3
//9     *    5    //4个空格  line-4
public class Rhombic {
	public static void main(String[] args) {

		int line = 13;
		int x = 1;
		int y;
		for( ;x <= line;x++) {
			for(y = 1;y <= (line + 1) / 2 - x ;y++) {
				System.out.print(" ");				
			}
			for(y = 1;y <= x - (line + 1) / 2 ;y++) {
				System.out.print(" ");				
			}
			for(y = 1;y <= line;y++) {
				if(y == 1 || y == 2 * x - 1 || y == 2 * (line - x) + 1) {
					//y == 2 * x - 1 右上边
					//y == 2 * (line - x) + 1 右下边
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}