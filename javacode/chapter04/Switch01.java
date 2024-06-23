//switch分支结构快速入门
//
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {

		System.out.println("请输入关键字");
		Scanner myscanner = new Scanner(System.in);
		char c1 = myscanner.next().charAt(0);
		char a,b,c,d,e,f,g;
		switch(c1) {
			case 'a':
				System.out.println("Monday!");
				break;			
			case 'b':
				System.out.println("Tuesday!");
				break;
			case 'c':
				System.out.println("Wednesday!");
				break;
			case 'd':
				System.out.println("Thursday!");
				break;			
			case 'e':
				System.out.println("Friday");		
				break;			
			case 'f':
				System.out.println("Saturday!");
				break;			
			case 'g':
				System.out.println("Sunday!");
				break;			
			default:
				System.out.println("Warning!!! Typing Error!!!");
				break;
		}

	}
}