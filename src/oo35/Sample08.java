package oo35;

public class Sample08 {

	public static void main(String[] args) {
		try {
			waru(10, 0);
		} catch (Exception e) {
			//System.out.println("例外が発生したよ！");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("例外処理終了");
		}
		
		System.out.println("終了");
	}
	
	static void waru(int x, int y) throws Exception {
		if (y == 0) {
			//throw new MyException(); //明示的に例外オブジェクトをスローする
			throw new MyException("０で割ったからエラーだよ！"); //明示的に例外オブジェクトをスローする
		}
		
		System.out.println(x / y); //ArithmeticException
	}

}
