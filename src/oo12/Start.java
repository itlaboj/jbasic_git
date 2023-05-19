package oo12;

public class Start {

	public static void main(String[] args) {
		//Humanクラス型の配列の宣言と領域確保
		Human[] list = new Human[3];
		
		list[0] = new Human("山田太郎", 23);
		list[1] = new Human("佐藤次郎", 35);
		list[2] = new Human("鈴木花子", 20);
		
		for (int i = 0; i < list.length; i++) {
			list[i].introduce();
		}
		
		System.out.println();
		
		for (Human h : list) {
			h.introduce();
		}
	}

}
