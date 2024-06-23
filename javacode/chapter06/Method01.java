

public class Method01 {
	public static void main(String[] args) {

		//1.方法写好后，如果不去调用，不会输出
		//2.先创建对象，然后调用即可
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);//调用cal02方法，同时n = 5
		p1.cal02(100);////调用cal02方法，同时n = 100

		int returnRes = p1.getSum(10,20);
		/*int returnRes = p1.getSum(10,20,30);
		错误: 实际参数列表和形式参数列表长度不同
		多了少了都不行*/
		
		//调用getSum方法，同时num1 = 10, num2 = 20
		//把方法返回的值赋给变量 returnRes = 30
		System.out.println("returnRes = " + returnRes);


	}
}


class Person {

	String name;
	int age;

	//成员方法
	public void speak() {
		System.out.println("我爱你");
	}
	//1.public 表示方法是公开的
	//2.void 表示方法没有返回值
	//3.speak() speak是方法名  ()是形参列表
	//4.{}是方法体，可以写要执行的代码
	//5.System.out.println("我爱你");表示我们的方法就是输出一句话 //


	//添加cal01方法，可以计算1+... +1000的结果
	public void cal01() {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}


	//添加cal02方法，接收任意的n；可以计算1+... +n的结果
	//(int n) 形参列表，表示当前有一个形参n，可以接收用户传入的数
	public void cal02(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("cal02的和为" + sum);
	}


	//添加getSum成员方法，可以计算两数之和
	//1.public 表示方法是公开的
	//2.int 表示方法执行后返回一个int值
	//3.getSum方法名
	//4.(int nun1, int num2) 形参列表，2个形参，可以接收用户传入的两个数
	//5.return res 表示把res的值，返回
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

}