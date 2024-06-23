public class ArithmeticOperatorPractice02 {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = 20;
		int i = i1++;//i = 10,i1 = 11
		System.out.println("i=" + i);//10
		System.out.println("i1=" + i1);//11
		i = --i2;//i2 = 19 . i = 19
		System.out.println("i=" + i);//19
		System.out.println("i2=" + i2);//19

	}
}	