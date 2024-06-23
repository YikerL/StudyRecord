
public class OverLoadExercise01 {
	public static void main(String[] args) {

		Method mmm = new Method();

		System.out.println(mmm.m(2));
		System.out.println(mmm.m(1, 3));
		mmm.m("520");
	
		System.out.println(mmm.max(5, 7));
		System.out.println("==============");
		System.out.println(mmm.max(2.2, 3.3));
		System.out.println("==============");
		System.out.println(mmm.max(2, 13, 4.4));//13.0
	}
}


class Method {

	public int m(int n) {
		return n * n;
	}
	public int m(int n1, int n2) {
		return n1 * n2;
	}
	public void m(String n) {
		System.out.println(n);
	}

	public int max(int n1, int n2) {
		/*if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}*/
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	public double max(double n1, double n2,double n3) {		
		/*if(n1 > n2) {
			if(n1 > n3) {
				return n1;
			} else {
				return n3;
			} 
		} else {
			if(n2 > n3) {
				return n2;
			} else {
				return n3;
			}
		}*/
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}