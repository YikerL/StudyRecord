import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个随机整数");
		int i = myScanner.nextInt();
		if(i - 0 > 0) {
			System.out.println(i + "是大于0的整数");		
		} else if(i - 0 < 0) {
			System.out.println(i + "是小于0的整数");
		} else if(i - 0 == 0) {
			System.out.println(i + "是等于0的整数");
		}

	}
}