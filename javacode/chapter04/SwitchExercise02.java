import java.util.Scanner;


//question
//使用switch分支
//对于学生成绩大于60的输出合格
//成绩小于60分的输出不合格
//注意输入的成绩不能大于100

public class SwitchExercise02 {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		double score = myscanner.nextDouble();
		if(score > 100 || score < 0) {
			
			System.out.println("输入错误");
		
		} else {
			switch((int)(score/60)) {
			case 1 :
				System.out.println("合格");
				break;
			case 0 :
				System.out.println("不合格");
				break;					
			}
		}
		

	}
}