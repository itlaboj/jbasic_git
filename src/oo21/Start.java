package oo21;

public class Start {

	public static void main(String[] args) {
		//３名を操作するリモコン
		Human h;
		
		h = new Arai();
		h.eat();
		
		h = new Okada();
		h.eat();
		
		h = new Nakada();
		h.eat();
	}

}
