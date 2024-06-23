
public class Homework06 {
	public static void main(String[] args) {

		Calculate c1 = new Calculate(6, 0);
		double add = c1.add();
		System.out.println(add);
		double sub = c1.subtract();
		System.out.println(sub);
		double mul = c1.multiply();
		System.out.println(mul);
		
		Double div = c1.divide();
		if(div != null) {
			System.out.println(div);
		}	

	}
}

class Calculate {

	double num1;
	double num2;

	//加
	public Calculate(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	} 
	//减
	public double add() {
		return num1 + num2;
	}
	//乘
	public double subtract() {
		return num1 - num2;
	}
	//除
	public double multiply() {
		return num1 * num2;
	}

	public Double divide() {
		if(num2 == 0) {
			System.out.println("除数不可以为0");
			return null;
		} else {
			return num1 / num2;
		}
	}
}