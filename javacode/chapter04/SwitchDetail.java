//Switch分支细节
//
//细节1
//表达式数据类型应和case后的常量类型一致
//或者是可以自动转换成可以相互比较的类型，比如输入的是char类型，常量是int类型

//细节2
//switch(表达式)中表达式返回的值必须是：byte,short,int,char,enum【枚举】,String

//细节3
//case句子中的值必须是常量或者是常量表达式，不能是变量

//细节4
//default子句是可选的

//细节5
//break语句在完成一个case分支后用来使程序跳出switch结构
//如果没有break，程序会顺序执行到switch结尾（穿透），除非遇到break

public class SwitchDetail {
	public static void main(String[] args) {

		char c = 'a';
		//double c = 1.1;//错误: 不兼容的类型: 从double转换到int可能会有损失
		switch(c) {
		//switch小写
			//case 1.1 :
			case 'a' :
				System.out.println("ok1");
				//break;
			case 20 :
				System.out.println("ok2");
				break;
			default :
				System.out.println("no");
				//default后的break可省略
		}

	}
}