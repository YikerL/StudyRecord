//引出类与对象OOP
import java.util.Scanner;

public class Object01 {
	public static void main(String[] args) {

		// String cat[][] = {{"小白", "三岁", "白色"},{"小花", "100岁", "花色"}};
		// //1.数据类型体现不出来
		// //2.只能通过下标获取信息，变量名和内容的对应关系不明确
		// //3.不能体现猫的行为
		// //==>不利于数据的管理，效率低

		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("请输入小猫名字");
		// String name = myScanner.next();
		// int n = -1;

		// for(int i = 0; i < cat.length; i++) {
		// 	if(name.equals(cat[i][0])) {
		// 		for(int j = 0; j < cat[0].length; j++) {
		// 			System.out.print(cat[i][j] + " ");
		// 		}
		// 		System.out.println("");
		// 		n++;
		// 	}
		// }
		// if(n == -1) {
		// 	System.out.println("张奶奶没有这只猫");
		// }

	

		//使用OOP来解决
		//实例化一只猫//创建猫对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		//访问对象的属性
		System.out.println("第一只猫的信息：" + cat1.name + " " 
			+ cat1.age + " " + cat1.color);

	}
}

//使用面向对象的方式来解决问题
//
//定义一个猫类 Cat

class Cat {
	//属性//成员变量//field(字段)
	String name;//名字
	int age;//年龄
	String color;//颜色

	//行为
}