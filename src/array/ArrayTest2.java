package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26]; //문자형 배열
		char ch = 'A'; // 65
		
		for(int i = 0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
			System.out.println(alphabets[i]);
		}
	}
}
