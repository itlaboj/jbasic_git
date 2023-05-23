package oo35;

public class Sample06 {

	public static void main(String[] args) {
		try {
			waru(10, 0);
		} catch (Exception e) {
			System.out.println("例外が発生したよ！");
		} finally {
			System.out.println("例外処理終了");
		}
		
		System.out.println("終了");
	}
	
	static void waru(int x, int y) throws Exception {
		System.out.println(x / y); //ArithmeticException
	}

}
