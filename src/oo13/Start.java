package oo13;

public class Start {

	public static void main(String[] args) {
		//Humanクラス型の配列の宣言と領域確保と初期化
		Human[] list = new Human[] {
				new Human("山田太郎", 23),
				new Human("佐藤次郎", 35),
				new Human("鈴木花子", 20)
		};
		
		for (int i = 0; i < list.length; i++) {
			list[i].introduce();
		}
		
		System.out.println();
		
		for (Human h : list) {
			h.introduce();
		}
	}

}
