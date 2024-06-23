//嵌套分支练习

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入您的初赛分数(0.0-10.0)");
		double score = myscanner.nextDouble();
		if(score < 0.0 && score > 10.0) {
			System.out.println("请输入正确的分数");
		}

		System.out.println("请输入您的性别");
		char gender = myscanner.next().charAt(0);
		if(gender != '男' && gender != '女') {
			System.out.println("请输入正确的性别");
		}
		
		if(score > 8.0) {
			if(gender == '男') {
				System.out.println("您已进入男子组决赛");
			}else {
				System.out.println("您已进入女子组决赛");
			}
		}else{
			System.out.println("您已被淘汰");
		}

	}
}