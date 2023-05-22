package oo35;

public class Sample02 {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("０で割れないよ！");
		} finally {
			System.out.println("例外処理終了");
		}
		
		System.out.println("終了");
	}

}
