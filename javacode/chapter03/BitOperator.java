public class BitOperator {

	public static void main(String[] args) {

		int a = 1 >> 2;
		System.out.println(a);
		int b = 1 << 2;
		System.out.println(b);
		int c = 1 >>> 2;
		//-0000001 >>> 2 => 00000000
		System.out.println(c);
	}
}