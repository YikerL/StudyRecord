

public class Homework10 {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		PassObject p1 = new PassObject();
		p1.printAreas(c, 5);

	}
}


class Circle {
	double radius;

	/*public Circle(double radius) {
		this.radius = radius;
	}*/
	public double findAreas() {
		return Math.PI * radius * radius;
	}

	public void changeRadius(double radius) {
		this.radius = radius;
	}
}

class PassObject {
	public void printAreas(Circle c, int times) {
		for(int i = 1; i <= times; i++) {
			c.changeRadius(i);
			System.out.println((double)i + "\t\t" + c.findAreas());
		}
	}
}