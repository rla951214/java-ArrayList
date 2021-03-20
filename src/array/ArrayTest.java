package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3};  // 자료형 integer 배열
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		
		int[] numbers1 = new int[5];
			for(int i = 0; i<numbers1.length; i++) {
				System.out.println(numbers1[i]);
		}
	}
}
