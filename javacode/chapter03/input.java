//演示接收用户的输入
//Scanner类表示简单的文本扫描器，在java.util下
//1.先引入Scanner类所在的包
//2.创建Scanner对象
//3.接收用户的输入，使用 相关的方法
import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//new 创建一个对象,小写scanner是对象名
		System.out.println("请输入名字");//接收用户输入的字符串
		
		//当程序执行到此处时会等待用户输入
		String name = scanner.next();
		System.out.println("请输入年龄");//接收用户输入的int
		int age = scanner.nextInt();
		System.out.println("请输入薪水");//接收用户输入的double
		double salary = scanner.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("name=" + name + " age=" + age + " salary=" + salary);

	}
}