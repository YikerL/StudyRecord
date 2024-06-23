import java.util.Scanner;

public class NestedIf01 {
	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入分数");
		double score = myscanner.nextDouble();

		if (score < 0 || score > 10) {
			System.out.println("输入错误");
		} else {
			if (score > 8.0) {
				System.out.println("请输入性别");
				char gender = myscanner.next().charAt(0);
				if(gender == '男') {
					System.out.println("男子组决赛");
				} else if(gender == '女') {
					System.out.println("女子组决赛");
				} else {
					System.out.println("输入错误");
				}
			} else {
				System.out.println("sorry");
			}
		}
	}
}