//基本数据类型的传参机制

public class MethodParameter {
	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		myTools plan1 = new myTools(); 
		plan1.swap(a, b);
		System.out.println("调用完swap方法后");
		System.out.println("a=" + a + "\tb=" + b);//a=10 b=3

	}
}


class myTools {
	
	public void swap(int a, int b) {
		//a和b交换
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + "\tb=" + b);
	
	}
}