//if-elxe入门练习

import java.util.Scanner;
public class If02 {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = myscanner.nextInt();
		if (age > 18) {
			System.out.println("坐牢"); 
		}
		else {
			System.out.println("回家观察");
		}
	}
}