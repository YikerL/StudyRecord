//克隆对象

public class MethodExercise02 {
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "jack";
		p1.age = 18 ;

		MyTools temp = new MyTools();
		Person p2 = temp.copyPerson(p1);
		
		System.out.println("p1.name=" + p1.name + "\tp1.age" + p1.age);
		System.out.println("p2.name=" + p1.name + "\tp2.age" + p1.age);
		System.out.println(p1 == p2);//false 复制的是两个个体但属性相同

	}
}

class Person {
	String name;
	int age;
}


class MyTools {

	public Person copyPerson(Person people) {

		Person temp = new Person();
		temp.name = people.name;
		temp.age =people.age;
		return temp;

	} 
}

