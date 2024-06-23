//数组的引出

public class Array01 {
	public static void main(String[] args) {

		//传统方法
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;

		// double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		// double avgWeight = totalWeight / 6;//平均体重
		//繁琐

		//数组 
		//定义一个数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		//double类型的数组,数组名hens
		//{3, 5, 1, 3.4, 2, 50}表示数组的值/元素
		//在java中可以通过 数组名.length 得到数组的大小/长度 => 数组内有几个元素
		System.out.println("数组的长度 = " + hens.length);
		double totalWeight = 0;
		double avgWeight = 0;
		//遍历数组得到数组的所有元素的和
		for(int i = 0; i < hens.length; i++) {
			System.out.println("第" + (i + 1) + "个元素的值= " + hens[i]);
			//可以通过hens[下标]来访问数组中的元素
			//下标从0开始编号
			 totalWeight += hens[i];
		}
		System.out.println("总重量= " + totalWeight);
		System.out.println("平均重量= " + totalWeight / hens.length);

	}
}