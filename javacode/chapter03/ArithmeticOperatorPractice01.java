public class ArithmeticOperatorPractice01{

	public static void main(String[] args){

		int i = 1;
		i = i++;
		/*
		可以理解为使用了一个临时变量temp，进行如下运算过程
		temp = i;
		i = i + 1;
		i = temp; 
        */
		System.out.println(i);//1
		

		int j = 1;
		j = ++j;
		/*
		可以理解为使用了一个临时变量temp，进行如下运算过程
		temp = j;
		j = j + 1;
		j = j; 
        */
		System.out.println(j);//2

	}
}