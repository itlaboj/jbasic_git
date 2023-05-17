package p02;

public class Sample33 {

	public static void main(String[] args) {
		//メソッドの呼び出し
		tan();
		arai(10, 20);
		int result = okada(100, 200);
		System.out.println(result);
	}
	
	//メソッドの定義
	static void tan() {
		System.out.println("はーい！");
	}
	
	static void arai(int x, int y) {
		System.out.println(x + y);
	}
	
	static int okada(int x, int y) {
		return (x + y);
	}

}
