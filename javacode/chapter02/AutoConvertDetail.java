 //自动类型转换
 public class AutoConvertDetail{
 	public static void main(String[] args){
 		int n1 = 10;
 		//float n2 = n1 + 1.1; 错误: 结果类型是double
 		double n3 = n1 + 1.1;//对，结果类型是double
 		float n4 = n1 + 1.1F;//对，结果类型是float

 		//精度大赋给精度小报错，反之自动转换
 		//
 		//（byte,short）和char之间不会相互自动转换
 		byte b1 = 10;//-128--127
 		//byte b2 = 1000;//错误
 		//int n2 = 1;
 		//byte b3 = n2;//错误
 		//把具体的数赋给byte时，判断是否在byte范围内
 		//把变量赋给byte时判断类型
 		//char c1 = b1;//错,不能转换
 		
 		
 		//byte,char,short可以计算，计算时首先转换为int类型
 		byte b4 = 1;
 		byte b5 = 2;
 		short s1 = 1; 
 		//short s2 = b4 + s1;//b4 + s1 => int
 		int s2 = b4 + s1;

 		//byte b6 = b4 + b5;//错误
 		//出现byte，short，char中的一个，自动转换为int
 		
 		//boolean不参与转换
 		boolean pass = true;
 		//int num100 = pass;
 		
 		byte num33 = 1;
 		short num44 = 100;
 		int num55 = 1;
 		double num66 = 1.1;
 		//运算结果类型为操作数精度最高的那一种类型
 		double num77 = num33 + num44 + num55 + num66;
 		System.out.println(num77); //103.1
 	}
 }