import java.util.Scanner;
import java.util.Random;
public class Homework11 {
	public static void main(String[] args) {
	
		
		//int count = 0;//用来计数电脑赢了几句
		int games = 10;
		Tom tom = new Tom();

		
		for(int i = 1; i <= games; i++) {
			//Random c = new Random();
			//int computer = c.nextInt(3);
			int computer = (int)(Math.random() * 100) / 33; 
			//System.out.println(computer);
			//电脑随机出 0石头， 1剪刀， 2布
			//
			//Tom随机出 0石头， 1剪刀， 2布
			int tom1 = tom.give();
			if(computer == 0 && tom1 == 1) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));
				System.out.println("\t电脑获胜");
			} else if(computer == 0 && tom1 == 2) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));				
				System.out.println("\tTom获胜");
			} else if(computer == 1 && tom1 == 2) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));				
				System.out.println("\t电脑获胜");
			} else if(computer == 1 && tom1 == 0) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));
				System.out.println("\tTom获胜");
			} else if(computer == 2 && tom1 == 0) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));				
				System.out.println("\t电脑获胜");
			} else if(computer == 2 && tom1 == 1) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));			
				System.out.println("\tTom获胜");
			} else if(computer == 0 && tom1 == 2) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));				
				System.out.println("\tTom获胜");
			} else if(computer == tom1 ) {
				System.out.print("电脑:" + tom.kind(computer) + " Tom:" + tom.kind(tom1));
				System.out.println("\t平局");
			}
			System.out.println("\t");
			
		}

	}
}


class Tom {
	Scanner myScanner = new Scanner(System.in);
	
	public int give() {
		System.out.println("请选择出什么0石头， 1剪刀， 2布");
		return myScanner.nextInt();

	}

	public String kind(int n) {
		if(n == 0) {
			return "石头";
		} else if(n == 1) {
			return "剪刀";
		} else if(n == 2) {
			return "布";
		} else {
			System.out.println("请输入正确的数0/1/2");
			return null;
		}
	}

}