//逻辑与和短路与的用法
public class LogicOperator {

	public static void main(String[] args) {

		//短路与
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("年轻人");
		}
		
		//逻辑与
		if(age > 20 & age < 90) {
			System.out.println("不讲武德");
		}

		System.out.println("====================");
		int a = 5;
		int b = 7;
		if(a < 3 && ++b > 6) {
			System.out.println("ok");
		}
		System.out.println("a=" + a + "b=" + b);//a=5.b=7//++b没执行

		System.out.println("====================");
		int c = 5;
		int d = 7;
		if(c < 3 & ++d > 6) {
			System.out.println("ok");
		}
		System.out.println("c=" + c + "d=" + d);//a=5,b=8  
		//短路与&&在判断第一个条件为false后不执行后面的语句
		//逻辑与会把两个条件全部执行并判断
		//在开发中基本上使用短路与， 效率更高


//逻辑或和短路或的用法
		//短路或
		System.out.println("====================");
		int m = 33;
		int n = 22;
		if(m < 40 || ++n > 20) {
			System.out.println("ok");
		}
		System.out.println("m=" + m + "n=" + n);//m = 33 , n = 22



		//逻辑或
		System.out.println("====================");
		int p = 33;
		int q = 22;
		if(p < 40 | ++q > 20) {
			System.out.println("ok");
		}
		System.out.println("p=" + p + "q=" + q);//p=33,q=23
		//不管第一个条件真假都要判断第二个条件
	}
}