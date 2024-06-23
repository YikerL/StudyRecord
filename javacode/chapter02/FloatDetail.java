//浮点类型细节

public class FloatDetail
{
	public static void main(String[] args) 
	{
		//float n1 = 1.1;//错误 
		//java中浮点数默认为double类型，声明float型变量，须在后面加'f'或'F' 
		float n2 = 1.1F;//对
		double n3 = 1.1;//对 
		double n4 = 1.1F;//对
 
		double n51 = 512.0f;
		System.out.println(n51);
		double n5 = .123;//0可以省略
		System.out.println(n5);

		double n6 = 5.12e2;
		System.out.println(n6);//512
		double n7 = 5.12e-2;
		System.out.println(n7);//0.0512

		//通常情况下使用double型浮点数，应为它的精度更高
		double num8 = 2.276435873346;
		float num9 = 2.33746587282f;
		System.out.println(num8);
		System.out.println(num9);//丢失后面几位数据

		//浮点数使用陷阱
		double num10 = 2.7;
		double num11 = 8.1 / 3;//2.7
		System.out.println(num10);
		System.out.println(num11);//2.6999999999999997
		//对两个运算结果是小数的数据进行相等判断时，要小心
		// if( num10 == num11 )
		// {
		// 	System.out.println("相等");//运行结果没有输出相等
		// }
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		System.out.println(Math.abs(num10 - num11));
		System.out.println(Math.abs(num11 - num10));
		if(Math.abs(num10 - num11) < 0.000001)//计算num10-num11的绝对值//可以通过java API来看
		{
			System.out.println("差值非常小，到达规定精度，可以视为相等");
		}
 	}
}