public class Homework01 {
	public static void main(String[] args) {

		//double[] arr = {4.5, 6.3, 3.3, 5.4, 5}; 
		//double[] arr = {};
		double[] arr = null;
		A01 a1 = new A01();		
		System.out.println(a1.max(arr));
	}
}

class A01 {

	public Double max(double[] arr) {
		  //Double包装类
		if(arr == null || arr.length == 0) {
		//if(arr.length == 0 || arr == null) {
		//这样写运行时遇到double[] arr = null;就会报错
		//因为逻辑或先判断前一个条件，判断时不存在arr.lrngth直接报错
			System.out.println("请输入正确的的数组");
			return null;
		}

		double max = arr[0];//假设arr[0]是最大值
		for(int i = 1; i < arr.length; i++) {			
			/*if(max > arr[i]) {
				continue;
			} else { 
				max = arr[i];
			}*/
			
			// max = max > arr[i] ? max : arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
}