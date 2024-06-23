public class ConstructorExercise {
	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		Person p4 = new Person("Tom", 33);
		Person p5 = new Person("Jack", 23);
		Person p6 = new Person("John", 13);
		System.out.println(p4.name + " " + p4.age);
		System.out.println(p5.name + " " + p5.age);
		System.out.println(p6.name + " " + p6.age);

	}
}

class Person {
	String name;//默认null
	int age;//默认0
	public Person() {
		age = 18;
	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}