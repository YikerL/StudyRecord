//多分支练习
//
import java.util.Scanner;

public class IfExercise04 {

	public static void main(String[] args) {

		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入信用分（1-100）：");
		int scores = myscanner.nextInt();

		// if(scores >= 0 &&scores <=100) {
		// 	if(scores == 100) {
		// 		System.out.println("信用极好");
		// 	}else if(scores >= 80 && scores <= 99) {
		// 		System.out.println("信用优秀");
		// 	}else if(scores >= 60 && scores <= 79) {
		// 		System.out.println("信用一般");
		// 	}else {
		// 		System.out.println("信用不及格");
		// 	}
		// }else {
		// 	System.out.println("输入错误,请重新输入");
		// }

		if(scores <= 0 ||scores >=101) {
			System.out.println("输入错误,请重新输入");
		}else if(scores == 100) {
			System.out.println("信用极好");
		}else if(scores >= 80 && scores <= 99) {
			System.out.println("信用优秀");
		}else if(scores >= 60 && scores <= 79) {
			System.out.println("信用一般");
		}else {
			System.out.println("信用不及格");
		}
	}
}