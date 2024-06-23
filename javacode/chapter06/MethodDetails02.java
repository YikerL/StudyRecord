public class MethodDetails02 {
	public static void main(String[] args) {

		dog yyy = new dog();
		yyy.dog1();
	}
}



class dog {
	public void dog1() {
		cat xxx = new cat();
		xxx.cat1();
	}

}


class cat {
	public void cat1() {
		System.out.println("hello cat1");
	}
}