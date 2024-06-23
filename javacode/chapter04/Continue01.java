//continue快速入门
public class Continue01 {
	public static void main(String[] args) {

		label1:
		for(int j = 0; j < 4 ; j++) {
		label2:
			for(int i = 0; i < 5 ; i++) {
				if(i == 2) {
					//continue;
					continue label2;//等价于continue
					//i=0 i=1 i=3 i=4
					//i=0 i=1 i=3 i=4
					//i=0 i=1 i=3 i=4
					//i=0 i=1 i=3 i=4 
					//continue label1;
					//i=0 i=1
					//i=0 i=1
					//i=0 i=1
					//i=0 i=1
					
				}
				System.out.println("i = " + i);
			}
			
		}

	}
}