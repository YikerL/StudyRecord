public class Recursion02 {
	public static void main(String[] args) {

		MyTools p = new MyTools();

		int res = p.fibo(6); 
		System.out.println(res);

	}
}


class MyTools {

	 //斐波那契数列
	 //求第n个斐波那契数是多少
	
	 public int fibo(int n) {

	 	if(n == 1 || n == 2) {
	 		return 1;
	 	} else if(n >= 3) {
	 		return fibo(n - 1) + fibo(n - 2);
	 	} else {
	 		System.out.println("请输入有效的正整数");
	 		return 0;//返回一个无效值
	 	}
	 }
}