//判断一个整数是否是水仙花数
//水仙花数即一个三位数，其各位上的数字的立方和等于其本身
//例： 153=1*1*1 + 5*5*5 + 3*3*3

public class Homework03 {
	public static void main(String[] args) {

		int i = 100;
		int a,b,c;//分别表示三位数的百位十位和个位
		for( ; i < 1000; i++) {
			a = i / 100;
			//b = (i - a * 100) / 10;//求该数十位上的数
			b = i % 100 / 10;//求该数十位上的数
			//c = i - a * 100 - b * 10;
			c = n % 10;//求该数个位上的数		
			if(i == ((a * a * a) + (b * b * b) + (c * c * c))) {
				System.out.println(i + "是水仙花数");
			
			}
		}
		
	}
}