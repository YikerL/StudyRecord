
public class This01 {
	public static void main(String[] args) {

		Dog dog1 = new Dog("旺财", 5);
		System.out.println("dog1的hashCode值=" + dog1.hashCode());
		dog1.info();//dog1调用info，this是dog1的this
		//哪个对象调用this就代表哪个对象

		System.out.println("=======================");
		Dog dog2 = new Dog("来福", 3);		
		System.out.println("dog2的hashCode值=" + dog2.hashCode());
		dog2.info();

	}
}

class Dog {
	String name;
	int age;

	/*public Dog(String dName, int dAge) {
		name = dName;
		age = dAge;
	}*/


	/*public Dog(String name, int age) {
		name = name;
		age = age;
	}*/
	//输出null    0
	//根据就近原则两个name都是形参
	//自己给自己赋了一次值
	//引出this
	//调用方法info输出时，最近的name是属性name，只有默认值

	public Dog(String name, int age) {
		//this.name当前对象的属性name
		this.name = name;
		//this.age当前对象的属性age
		this.age = age;
		System.out.println("this的hashCode值" + this.hashCode());
	}

	public void info() {
		System.out.println(name + "\t" + age + "\t");
		System.out.println("this的hashCode值" + this.hashCode());
	}
}