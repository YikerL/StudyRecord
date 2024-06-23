public class Homework02 {
	public static void main(String[] args) {

		String[] arr = {"孙悟空", "齐天大圣", "美猴王", "大师兄"}; 
		String str = "美猴王";
		A02 a1 = new A02();
		//a2.max(arr);		
		if(a1.find(str ,arr) != -1) {
			System.out.println(a1.find(str ,arr));
		}

	
	}
}



class A02 {
	 public int find(String str, String[] arr) {
	 	for(int i = 0; i < arr.length; i++) {
	 		if(arr[i].equals(str)) {
	 			return i;
	 		}
	 	}
	 	System.out.println("找不到" + str);
	 	return -1;
	 }
}