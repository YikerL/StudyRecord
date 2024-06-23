//!非和^逻辑异或用法演示

public class InverseOperator {

	 public static void main(String[] args) {

	 	System.out.println(7 > 3); 
	 	System.out.println(!(7 > 3));


	 	//a^b:当a和b不同时结果为true反之为false
	 	System.out.println("============================");
	 	boolean x = (7 > 6) ^ (3 > 4);//true
	 	System.out.println(x);
	 	boolean y = (7 > 6) ^ (3 < 4);//false
	 	System.out.println(y);

	 } 
}