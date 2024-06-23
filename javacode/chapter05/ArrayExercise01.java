

public class ArrayExercise01 {
	public static void main(String[] args) {

		char word[] = new char[26];
		for(int i = 0; i < word.length; i++) {
			word[i] = (char)('A' + i);//'A' + i是int类型
		}
		for(int i = 0; i < word.length; i++) {
			System.out.print(word[i] + " ");
		}
	}
}
