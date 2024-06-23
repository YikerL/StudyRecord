//return快速入门
public class Return01 {
	public static void main(String[] args) {

		int i;
		for(i = 1; i <= 5; i++) {
			if(i == 3) {
				System.out.println("Good Luck!" + i);
				return;
				//continue;
				//break;
			} 
			System.out.println("Good Job!" + i);	
		}
		System.out.println("Good Boy!" + i);

	}
}