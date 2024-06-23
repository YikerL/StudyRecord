 //强制数据类型转换
 //应用场景：进行数据从大到小的精度转换
 //强制转化符号只对最近的操作数有效
public class ForceConvert{
	public static void main(String[] args){
	int n1 = (int)1.9;
	System.out.println("n1=" + n1);//1,精度损失

	int n2 = 2000;
	//byte b1 = n2;//错误
	byte b2 = (byte)n2;
	System.out.println("b2=" + b2);//-48.数据溢出

        //int x = (int)10 * 3.5 + 6 * 1.5;//错误
        int x = (int)(10 * 3.5 + 6 * 1.5);//（int）44.0；使用小括号提升优先级
        System.out.println(x);


        //char类型可以保存int的常量值，不可以保存变量值，需要强转
        char c1 = 100;
        int m = 100;
        //char c2 = m;//错误
        char c3 = (char)m;
        System.out.println(c3);
	}
}