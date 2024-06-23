//跳转控制语句

//自动生成随机数（1-100），直到生成97，说明是第几个生成
public class Break {
	public static void main(String[] args) {

		
		for(int i = 0; ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			//Math.random()随机生成大于0.0小于1.0的数
			if(num == 97) {
				System.out.println("第" + i + "个生成数字97");
				break;
			}

			
		}
	}
}