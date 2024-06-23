//引用数据类型的传参机制

public class MethodParameter02 {
	public static void main(String[] args) {

		int people[] = {18, 8000};
		System.out.println("年龄" + people[0] + "工资" + people[1]);

		myTools plan = new myTools();
		plan.test100(people);
		
		System.out.println("调用完test001方法后");
		System.out.println("年龄" + people[0] + "工资" + people[1]);

		
		student stu1 = new student();
		stu1.name = "Tom";
		stu1.age = 19;
		
		myTools change = new myTools();
		change.test200(stu1);
		System.out.println("年龄" + stu1.age);

	}
}

class student {
	String name;
	int age;	
}

class myTools {
	
	public void test100(int[] arr) {
			
		arr[1] += 1000;
		System.out.println("年龄" + arr[0] + "工资" + arr[1]);
	
	}

	public void test200(student stu) {
		stu.age += 10;
	}
}