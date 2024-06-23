public class IfExercise02 {

	public static void main(String[] args) {

		int n1 = 6;
		int n2 = 10;
		int n3 = n1 + n2;
		if(n3 % 3 == 0 ) {
			if(n3 % 5 == 0) {	
				System.out.println("n1和n2之和既能被3整除又能被5整除");
			}else{
				System.out.println("n1和n2之和能被3整除不能被5整除");
			}
		}else{
			if(n3 % 5 == 0 ){
			System.out.println("n1和n2之和能被5整除不能被3整除");							
			}
		System.out.println("n1和n2之和能既不能被3整除也不能被5整除");							
		}
	}
}