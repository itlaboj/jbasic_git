package oo23;

public class Start {

	public static void main(String[] args) {
		//Humanクラス型の配列の宣言と領域確保と初期化
		Human[] list = new Human[] {
				new Arai(),
				new Okada(),
				new Nakada()
		};
		
		for (int i = 0; i < list.length; i++) {
			list[i].eat();
		}
		
		System.out.println();
		
		for (Human h : list) {
			h.eat();
		}
	}

}
