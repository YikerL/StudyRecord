

public class ArrayExercise02 {
	public static void main(String[] args) {

		int num[] = {4, -1, 9, 10, 23, 5};
		
		//自己摸索
		// int max = 0;
		// for(int i = 0; i < num.length; i++) {
		// 	if(num[i] > max) {
		// 		max = num[i];				
		// 	} 
		// 	if(i == num.length - 1) {
		// 		System.out.println("最大值为" + max);
		// 		for(int j = 0; j < num.length; j++) {
		// 			if(max == num[j]) {
		// 				System.out.println("最大值对应的下标为" + j);
		// 			}
		// 		}
		// 	}
		// }

		//老师的方法
		int max = num[0];
		int maxIndex = 0;
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
				maxIndex = i;
			}			 
		}		 
		//三元运算符
		// for(int i = 1; i < num.length; i++) {
		// 	max = max > num[i] ? max : num[i];									 
		// }//能比较出最大值

		System.out.println("最大值为" + max);
		System.out.println("最大值对应的下标为" + maxIndex);

	}
}