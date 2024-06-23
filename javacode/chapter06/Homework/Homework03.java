
public class Homework03 {
	public static void main(String[] args) {

		Book book1 = new Book();
		book1.updatePrice();
		System.out.println(book1.price);

		Book book2 = new Book();
		book2.price = 111;
		book2.updatePrice();
		System.out.println(book2.price);

	}
}



class Book {
	
	int price;
	
	public void updatePrice() { //用不着形参
		if(this.price > 150) {  //方法中没有price，可以不用this
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		} /*else {
			this.price = this.price;
		}*/ //没必要
	}

	
}