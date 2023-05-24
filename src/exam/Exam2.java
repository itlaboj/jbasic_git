package exam;

public class Exam2 {

	public static void main(String[] args) {
		//int型の配列arrayに５つの整数を格納（初期化）
		int[] array = new int[] { 1, 5, 4, 3, 2 };
		//int [] array = {1, 5, 4, 3, 2};

		//配列から奇数だけを表示①
		for (int data : array) {
			if (data % 2 != 0) {
				System.out.println(data);
			}
		}
		
		//配列から奇数だけを表示②
//		for (int data : array) {
//			if (data % 2 == 0) {
//				continue;
//			}
//
//			System.out.println(data);
//		}
		
	}

}
