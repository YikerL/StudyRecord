import java.util.Scanner;

public class NestedIf02 {
	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入当前月份");
		int month = myscanner.nextInt();
		if(month >= 4 && month <= 12) {
			System.out.println("请输入游客年龄");
			int age = myscanner.nextInt();
			if(age <18) {
				System.out.println("30$");
			} else if(age >= 18 && age <= 60) {
				System.out.println("60$");
			} else if(age >= 60) {
				System.out.println("20$");
			}
		} else {

			System.out.println("请输入游客年龄");
			int age = myscanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.println("40$");
			} else {
				System.out.println("20$");
			}
		}
	}
}