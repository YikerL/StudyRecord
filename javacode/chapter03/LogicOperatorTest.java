public class LogicOperatorTest {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;
		short z = 46;
		if((z++ == 46) && (y = true)) {
		//此处y = true 为赋值语句
			z++;
		}
		if((x = false) || (++z == 49)) {
			z++;
		}
		System.out.println("z=" + z);
		//*****必须注意等于号数量

	}
}