package oo22;

public class Start {

	public static void main(String[] args) {
		//Humanクラス型の配列の宣言と領域確保
		Human[] list = new Human[3];
		
		list[0] = new Arai();
		list[1] = new Okada();
		list[2] = new Nakada();
		
		for (int i = 0; i < list.length; i++) {
			list[i].eat();
		}
		
		System.out.println();
		
		for (Human h : list) {
			h.eat();
		}
	}

}
