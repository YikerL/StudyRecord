public class Recursion01 {
	public static void main(String[] args) {

		MyTools p1 = new MyTools();
		p1.test1(4);//n=2  n=3  n=4
		p1.test2(4);//n=2
		int res = p1.factorial(5);
		System.out.println(res);

	}
}

class MyTools {

	public void test1(int n) {
		if(n > 2) {
			test1(n - 1);
		}
		System.out.println("n=" + n);
	}

	public void test2(int n) {
		if(n > 2) {
			test2(n - 1);
		} else {
			System.out.println("n=" + n);
		}
	}


	//阶乘
	//自己的方法
	/*int result = 1;
	public int factorial(int n) {
		if(n >= 2) {
			result *= n--;
			factorial(n);
		}
		return result;
	}*/

	//老师的方法
	public int factorial(int n) {
		if(n == 1) {
			return n;
		} else {
			return factorial(n - 1) * n;
		}
	}

}