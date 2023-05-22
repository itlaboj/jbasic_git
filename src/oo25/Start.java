package oo25;

public class Start {

	public static void main(String[] args) {
//		final int data = 10;
//		data = 100;
//		
//		System.out.println(data);
		
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
