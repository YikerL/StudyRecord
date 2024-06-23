//赋值运算符演示
public class AssignOperator {
	
	public static void main(String[] args) {

		int n1 = 10;
		n1 += 3;
		System.out.println(n1);//13
		n1 -= 3;
		System.out.println(n1);//10
		n1 *= 3;
		System.out.println(n1);//30
		n1 /= 3;
		System.out.println(n1);//10
		n1 /= 3;
		System.out.println(n1);//3
		n1 %= 3;
		System.out.println(n1);//0

		//复合赋值运算符会进行类型转换、
		byte b = 7; 

		//b = b + 3;
		//错误: 不兼容的类型: 从int转换到byte可能会有损失
		
		b += 3;//等价于 b = (byte)(b + 3);
		System.out.println(b);
	}
}