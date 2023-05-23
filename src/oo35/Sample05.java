package oo35;

public class Sample05 {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("100")); //NumberFormatException
			System.out.println(10 / 0); //ArithmeticException
		} catch (Exception e) {
			System.out.println("例外が発生したよ！");
		} finally {
			System.out.println("例外処理終了");
		}
		
		System.out.println("終了");
	}

}
