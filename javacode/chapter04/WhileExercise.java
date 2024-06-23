//While循环练习

public class WhileExercise {
	public static void main(String[] args) {
   	
		int start = 40;
		int end = 200;
		int t = 2;
		int i = start;
		
		while( i <= end ) {
			if(i % t == 0){
				System.out.println(i);				
			}
			i ++ ;			
		}
	}
}