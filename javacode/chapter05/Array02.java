import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		//动态初始化方法一
		//double scores[]; = new double[5];

		//动态初始化方法二
		double scores[];
		scores = new double[5];//先声明再分配空间
		//二者的效果一样，根据具体情况使用

		for(int i = 0; i < scores.length; i++) {
			scores[i] = myScanner.nextDouble();
		}
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		
	}
}