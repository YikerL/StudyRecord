public class RecursionExercise {
	public static void main(String[] args) {

		MyTools p = new MyTools();

		int res = p.peach(10); 
		System.out.println(res);

	}
}


class MyTools {

	//猴子吃桃
	//一堆桃子，第一天猴子吃了一半加一个，
	//后面每天吃剩下的一半加一个，
	//第十条猴子打算吃的时候发现只剩下1个。
	//最初有多少桃子？
	public int peach(int day) {
		if(day > 1) {
			return (peach(day -1) + 1) * 2;
		} else if (day == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}