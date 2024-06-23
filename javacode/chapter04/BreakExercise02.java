import java.util.Scanner;

public class BreakExercise02 {
	public static void main(String[] args) {
   
		Scanner myScanner = new Scanner(System.in);		
		int i = 1;
		String account = "";
		String password = "";
		for( ; i <= 3; i++) {
			System.out.println("请输入用户名");
			account = myScanner.next();
			System.out.println("请输入密码");
			password = myScanner.next();		
			//字符串比较用equals
			//if(account.equals("丁真") && password.equals("666")) {  //两种写法都可以
			if("丁真".equals(account) && "666".equals(password)) {	  //下面这种更推荐
				System.out.println("登陆成功");
				break;
			} else {
				System.out.println("输入错误，还有" + (3 - i) + "次输入机会");
			}
			
		}

		
	}
}