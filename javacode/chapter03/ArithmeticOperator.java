/*
 *算术运算符使用演示
 */

public class ArithmeticOperator{

	public static void main(String[] args){

		//  /号使用
		System.out.println(10 / 4);//在java种结果为2
		System.out.println(10.0 / 4);//在java种结果为2.5
		System.out.println(10.0 / 4.0);//在java种结果为2.5
		//两个整数运算结果仍然是整数，小数点后面的舍去
		double d = 10 / 4;//2.0 先运算再将结果赋给double d
		System.out.println(d);

		System.out.println("================================");
		// %号使用：取模/取余数
		// %的本质：a % b = a - a / b * b
		System.out.println(10 % 3);//1
		//取10除以3的余数
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1


		System.out.println("================================");
		//++用法
		//独立使用时前++和后++都等价于i=i+1
		int i=10;
		i++;
		System.out.println("a=" + i);//11
		++i;
		System.out.println("b=" + i);//12
		//作为表达式使用
		//前++：++i先自增后赋值
		//后++：i++先赋值后自增
		int j = 5;
		int k = ++j;// =>j = j + 1;k + j;
		System.out.println("k=" + k);//6	
		System.out.println("j=" + j);//6
		int l = --j;
		System.out.println("l=" + l);//5

		
		int m = 5;
		int n = m++;// =>n = m;m = m + 1	
		System.out.println("m=" + m);//6
		System.out.println("n=" + n);//5
		int p = m--;
		System.out.println("p=" + p);//6

	}
}