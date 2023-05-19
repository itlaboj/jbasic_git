package oo19;

public class Start {

	public static void main(String[] args) {
		//３名のインスタンスを生成
		Arai a = new Arai();
		a.name = "新井";
		a.age = 20;
		a.cook();
		a.eat();
		
		Human h = new Arai();
		h.name = "新井";
		h.age = 20;
		h.eat();
		h.cook();
		
		Okada o = new Human();
		
//		Okada o = new Okada();
//		o.name = "岡田";
//		o.age = 21;
//		o.playTennis();
//		o.eat();
//		
//		Nakada n = new Nakada();
//		n.name = "中田";
//		n.age = 22;
//		n.dance();
//		n.eat();
	}

}
