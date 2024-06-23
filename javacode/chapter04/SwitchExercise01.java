//Switch练习
//
//
import java.util.Scanner;

public class SwitchExercise01 {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入小写字母");
		char input = myscanner.next().charAt(0);
		switch(input) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("other");
				break;
		}
	}
}