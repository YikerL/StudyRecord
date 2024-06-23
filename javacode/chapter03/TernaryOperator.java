public class TernaryOperator {
	public static void main(String[] args) {

		int a = 100,b = 99;
		int result = a > b ? a++ :b--;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);

	}
}