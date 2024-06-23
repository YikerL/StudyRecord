public class BreakExercise01 {
	public static void main(String[] args) {
   
		int i = 1;
		while(i <= 100) {
			int sum = 1 + i;
			if(sum == 20) {
				System.out.println("i = " + i);
				break;
			}
			i++;
		}

		
	}
}