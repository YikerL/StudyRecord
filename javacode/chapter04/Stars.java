//打印空心金字塔
//
public class Stars {
	public static void main(String[] args) {

		//打印半个金字塔
		//*
		//***
		//*****
		//*******
		//*********
		// int x = 1;
		// int y;
		// int line = 5;
		// for( ; x <= line ; x++) {
		// 	for(y = 1 ; y <= (x * 2 - 1) ; y++) {
		// 		if(y < (x * 2)) {
		// 			System.out.print("*");
		// 		}				
		// 	}
		// 	System.out.print('\n');
		// }
	


		//*********
		//*********
		//*********
		//*********
		//*********	
		//打印一个矩形
		// int x = 1;
		// int y;
		// int line = 5;
		// for( ; x <= line ; x++) {
		// 	for(y = 1 ; y <= 11; y++) {
		// 		if(y <= 11 ) {
		// 			System.out.print("*");
		// 		}				
		// 	}
		// 	System.out.println("");//换行
		// 	//System.out.print('\n');//换行
		// 	//System.out.println('\n');//换两行
		// }
		
		
		//自己摸索	
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// int x = 1;
		// int y;
		// int line = 5;
		// for( ; x <= line ; x++) {
		// 	for(y = 1;y <= (2 * line +1);y++){
		// 		if(y < (line + 1 -x)) {  //*以前的空格
		// 			System.out.print(" ");
		// 		} else if(y > (line + x - 1)) { //*以后的空格
		// 			System.out.print(" ");
		// 		} else {
		// 			System.out.print("*"); //打印每行的*
		// 		}
		// 	}				
		// 	System.out.print('\n');
		// }



		//老师的方法		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// int x = 1;
		// int y,k;
		// int line = 5;
		// for( ; x <= line ; x++) {
		// 	for(k = 1;k <= line - x;k++) {
		// 			System.out.print(" ");
		// 		} 
		// 	for(y = 1;y <= (2 * x - 1);y++) {				
		// 		System.out.print("*");				
		// 	}
		// 	System.out.print('\n');
		// }



		//镂空
		//    *         //       5   line - 0 / line + 0
		//   * *        //第二行 4和6 line - 1 / line + 1
		//  *   *       //第三行 3和7 line - 2 / line + 2
		// *     *      //第四行 2和8 line - 3 / line + 3
		//*********     //
		int x = 1;
		int y;
		int line = 20;
		for( ; x <= line ; x++) {
			for(y = 1;y <= line - x;y++) {
					System.out.print(" ");
				} 
			for(y = 1;y <= (2 * x - 1);y++) {				
				if(y == 2 * x - 1 || y == 1 || x == line){
					System.out.print("*");						
				}else{
					System.out.print(" ");
				}
			}
			System.out.print('\n');
		}

	}
}