public class TernaryOperatorExercise {
	public static void main(String[] args) {

		int a = 77;
		int b = 88;
		int c = 99;
		int d = 100;
		int bridge = a > b ? a : b;
		System.out.println(bridge);
		bridge = bridge > c ? bridge : c;
		System.out.println(bridge);
		int max = bridge > d ? bridge : d;
		System.out.println("最大数=" + max);
	}
}