//sequence顺序，序列
//顺序查找

import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {

		String arr[] = {"白眉鹰王", "金毛狮王", "青翼蝠王", "紫衫龙王"};
		Scanner myScanner = new Scanner(System.in);
		int index = -1;
		
		String input = myScanner.next();	
		for(int i = 0; i < arr.length; i++) {			
			if(input.equals(arr[i])) {
				System.out.print("匹配成功");
				break;
			} 
		}
		if(index == -1) {
			System.out.print("匹配失败");
		}
			

	}
}