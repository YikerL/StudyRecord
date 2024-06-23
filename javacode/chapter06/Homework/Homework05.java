public class Homework05 {
	public static void main(String[] args) {

		Circle c1 = new Circle(3);
		//c1.perimeter();
		//c1.area();
		System.out.println("园c1的周长=" + c1.perimeter() +
			               "\t园c1的面积=" + c1.area());
	}
}


class Circle {

	double radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	//求圆的周长
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	//求圆的面积
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

}