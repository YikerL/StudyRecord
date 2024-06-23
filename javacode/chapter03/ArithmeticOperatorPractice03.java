public class ArithmeticOperatorPractice03 {

	public static void main(String[] args) {
	
	int total = 88;
	int days = 88 % 7;
	//int weeks = (total - day) / 7;
	int weeks = 88 / 7;
	System.out.println("还有" + weeks + "个星期零" + days + "天"); 

	//考虑数学公式和Java语言的特性
	System.out.println("========================"); 
	double f = 234.5;
	double c = 5.0 / 9 * (f - 100);
	System.out.println("234.5华氏度对应的摄氏度为" + c);

	}
}