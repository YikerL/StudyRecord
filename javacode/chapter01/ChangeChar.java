//转义字符的使用

public class ChangeChar
{
	public static void main(String[] args)
	{
		// \t :制表位，实现对齐功能
		System.out.println("北京\t天津\t南京");
		// \n：换行符
		System.out.println("刘又嘉\n殷泽锋\n杨培\n");
		// \\：输出一个\，第一个\代表转译，第二个\是要输出的结果
		System.out.println("C:\\Users\\52547\\Desktop\\javacode");
		//  输出两个\\
		System.out.println("\\\\");
		//  \':输出一个'
		System.out.println("\'I love you\'");
		//  \":输出一个"
		System.out.println("\"Good morning\"");
		//  \r:输出一个回车
		//  \r光标回到当前行第一个字符
		System.out.println("Good afternoon\rGood evening");
		//  输出Good eveningon
		System.out.println("Good afternoon\r\nGood evening");
	}
}