

public class VarParametersExercise{
	public static void main(String[] args) {

		Method m = new Method();
		//m.scores("Tom", 88, 66);
		//m.scores("Emily", 88, 66, 99);
		//m.scores("Jack", 87, 66, 89, 99, 78);
		String str1 = m.scores("Tom", 88, 66);
		String str2 = m.scores("Emily", 88, 66, 99);
		String str3 = m.scores("Jack", 87, 66, 89, 99, 78);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}

class Method {

	public String scores(String str, double... nums) {
		double sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		//System.out.println(str + " " + nums.length + "门课的总分=" + sum);
		return str + " " + nums.length + "门课的总分=" + sum;
	}
}