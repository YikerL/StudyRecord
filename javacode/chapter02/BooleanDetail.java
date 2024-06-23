//布尔类型学习

public class BooleanDetail
{
	public static void main(String[] args)
	{
		//演示判断成绩是否通过的案例
		boolean isPass = true;
		//java中不可以用0或者非0整数代替true和false
		if(isPass ==  true)
		{
			System.out.println("考试通过");
		}else{
			System.out.println("考试未通过");
		}
	}
}