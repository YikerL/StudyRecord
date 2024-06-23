//输出1-100之间不能被5整除的数，每5个一行

public class Homework04 {
	public static void main(String[] args) {

		int i = 1;
		int count = 0;//用来统计输出的个数
		for( ; i <= 100; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0) {
					System.out.println("");
				}
			}
		}
		
	}
}