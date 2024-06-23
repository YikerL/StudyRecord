//基本数据类型和字符串转换
public class StringToBasic{
	public static void main(String[] args){

		//基本数据类型->String
		int n1 = 5;
		float f1 = 2;
		double d1 = 0;
		boolean b1 = false;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + s2 + s3 +  s4);
		System.out.println("==========================");

		//String->基本数据类型
		String s5 = "520";
		System.out.println(s5);
		
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		//byte num5 = Byte.parseByte(s5);
		Short num6 = Short.parseShort(s5);
		boolean num7 = Boolean.parseBoolean("true");

		System.out.println("==========================");
		System.out.println(num1);//520
		System.out.println(num2);//520.0
		System.out.println(num3);//520.0
		System.out.println(num4);//520
		//System.out.println(num5);//520超出byte范围，报错
		System.out.println(num6);//520
		System.out.println(num7);//true

		//字符串转成字符char => 把字符串的第一个字符取出
		System.out.println("==========================");
		System.out.println(s5.charAt(0));//得到s5字符串的第一个字符->5
		System.out.println(s5.charAt(1));

	} 
}