
public class Homework07 {
	public static void main(String[] args) {

		Dog dog1 = new Dog("大黄", "黄色", 3);
		dog1.show();

	}
}


class Dog {
	String name;
	String color;
	int age;

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show() {
		System.out.println("小狗的名字是" + name);
		System.out.println("小狗的颜色是" + color);
		System.out.println("小狗的年龄是" + age + "岁");
	}
}