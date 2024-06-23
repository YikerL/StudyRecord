
public class ThisExercise {
	public static void main(String[] args) {

		Person p1 = new Person("Tom", 18);
		Person p2 = new Person("Tom", 18);
		// boolean b = p2.compareTo(p1);
		// System.out.println(b);
		System.out.println(p2.compareTo(p1));
	}
}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(Person p) {
		/*if(this.name.equals(p.name) && this.age == p.age) {
			return true;
		} else {
			return false;
		}*/
		return this.name.equals(p.name) && this.age == p.age;
	}

}

class TestPerson {

}