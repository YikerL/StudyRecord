

public class Homework05 {
	public static void main(String[] args) {

		char word1 = 'a';
		char word2 = 'Z';
		//for( ; word1 <= 122;word1++) {
		for( ; word1 <= 'z';word1++) {	
			System.out.print(word1 + " ");
		}
		System.out.println("");
		for( ; word2 >= 'A';word2--) {
		//for( ; word2 >= 65;word2--) {
			System.out.print(word2 + " ");
		}
	}
}