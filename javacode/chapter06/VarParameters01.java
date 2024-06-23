//variable可变的
//可变参数快速入门

public class VarParameters01 {
	public static void main(String[] args){

	MyTools m = new MyTools();
	int sum = m.sum(1, 2, 3, 4);
	System.out.println(sum);
	}
}

class MyTools {

	//计算2，3，4...n个数的和
	
	public int sum(int... nums) {
//int...接收可变参数，表示接收多个参数（0--多），类型是int
//使用可变参数时，可以当作数组来使用
	System.out.println(nums.length + "个数求和");
	int sum = 0;
	for(int i = 0; i < nums.length; i++) {
		sum = sum + nums[i];
	}
	return sum;
	}
}