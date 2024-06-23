import java.util.Scanner;

public class MethodExercise01 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		//输入一个整数,判断是不是偶数，返回boolean
		//奇数odd；偶数even
		int n = myScanner.nextInt();
		AA point1 = new AA();
		
		if(point1.jud(n) == true) {
			System.out.println(n +  "是偶数");	
		} else {
			System.out.println(n +  "是奇数");
		}
		
		AA point2 = new AA();
		point2.myPrint(3, 5, '#');
		//打印三行五列#
		//行row；列column

	}
}

class AA {
 	
 	public boolean jud(int num) {
 		
 		//方法一
 		/*if(num % 2 == 0) {
 			return true;
 		} else {
 			return false;
 		}*/	

 		//方法二
 		//return num % 2 == 0 ? true : false;	

 		//方法三
 		return num % 2 == 0;//它的结果是boolean类型
 	}

 	public void myPrint(int row,int column,char c) {
 		for(int i = 1; i <= row; i++) {
 			for(int j = 0; j <= column; j++) {
 				System.out.print(c);
 			}
 			System.out.print("\n");
 		}
 	}

}