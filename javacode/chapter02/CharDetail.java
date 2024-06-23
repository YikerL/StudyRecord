//字符型细节

public class CharDetail
{
	public static void main(String[] args)
	{
		//字符常量用''括起来
		//在Java中，char的本质是一个整数，在默认输出时，对应的是unicode码对应的字符
		//要输出对应的数字，可以输出（（int）字符）
		char c1 = 'a';
		System.out.println(c1);//输出'a'
		System.out.println((int)c1);//输出'a'对应的数字97
        char c2 = 97;//字符型可以直接存放一个数字，输出时会按照对应的unicode字符输出
		System.out.println(c2);//当输出97时，会输出97对应的字符a//ASCII码
		
		char c3 = '\t';
		char c4 = '李';
		System.out.println(c3);//输出一个空格
		System.out.println(c4);//输出'李'

		//char类型是可以进行运算的，相当于整数运算
		System.out.println('a' + 10);//相当于91 + 10
	}
}