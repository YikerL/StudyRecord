

public class Homework01 {
	public static void main(String[] args) {

		double money = 100000.0;
		int count = 0;
		while(true) {
			if(money > 50000) {
				//money = money * 0.95;
				money *= 0.95;
				count++;
				//System.out.println("还剩下的钱" + money);
			} else if(money <= 50000) {
				money = money - 1000;
				//System.out.println("还剩下的钱" + money);			
				count++;
			} if(money < 1000) {
				break;
			}			
		}
		System.out.println("可以过" + count + "个路口");

	}
}

// public class Homework01 {
// 	public static void main(String[] args) {


		
// 	}
// }