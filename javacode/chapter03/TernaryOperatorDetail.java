public class TernaryOperatorDetail {
	public static void main(String[] args) {

		int a = 7 , b = 3;
		//表达式1和2要为可以赋给接收变量的类型（或可自动转换/强制转换）
		//int c = a > b ? 2.5 : 3.3 ;
		//错误: 不兼容的类型: 从double转换到int可能会有损失
		int c = a > b ? (int)2.5 : (int)3.3 ;
		System.out.println(c);//正确
		double d = a > b ? 2.5 : 3.3;
		System.out.println(d);//正确,满足自动转换
	}
}
	