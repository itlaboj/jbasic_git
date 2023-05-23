package oo35;

public class Sample03 {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("AAA")); //NumberFormatException
			System.out.println(10 / 0); //ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("０で割れないよ！");
		} catch (NumberFormatException e) {
			System.out.println("数値に変換できないよ！");
		} finally {
			System.out.println("例外処理終了");
		}
		
		System.out.println("終了");
	}

}
