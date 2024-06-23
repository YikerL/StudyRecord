//构造器基本入门和细节

public class Constructor {
	public static void main(String[] args) {

		Person p1 = new Person("Tom", 18);
		System.out.println(p1.name);
		System.out.println(p1.age);
		Person p2 = new Person("Jack");

		Dog d1 = new Dog();
		//使用的是默认的无参构造器
		//一旦定义了构造器就不能使用了，除非主动显式定义一个无参构造器

	}
}


class Dog {
//如果没有定义构造器，系统会自动生成一个默认无参构造器(默认构造器)
//可以通过javap来反编译
//默认构造器的形式
/*
	Dog() {
	
	}
 */
	Dog() {
	
	}

	public Dog(String dName) {

	}
}

class Person {
	
	String name;
	int age;
	
	//1
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	//2
	public Person(String pName) {
		name = pName;
	}
	//1和2构成了构造器重载
}