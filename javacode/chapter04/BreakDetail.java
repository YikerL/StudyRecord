public class BreakDetail {
	public static void main(String[] args) {
   
		lable1: //标签
		for(int j = 0; j < 4; j++ ) { //外层循环
		lable2:
			for(int i = 0; i < 10; i++ ) { //内层循环
				if (i == 2) {
					//break lable1;
					break;
				}
			System.out.println("i = " + i);
			}
		}

	}
}