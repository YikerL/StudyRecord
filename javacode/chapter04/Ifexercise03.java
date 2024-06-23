import java.util.Scanner;

public class IfExercise03 {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		int year = myscanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "年是闰年");
		}else{
			if(year % 400 == 0 ) {
			System.out.println(year + "年是闰年");
			}else{
			System.out.println(year + "年不是闰年");
			}
		}
								
		}
	}