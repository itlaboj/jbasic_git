package oo20;

public class Start {

	public static void main(String[] args) {
		//３名のインスタンスを生成
		Human h = new Arai();
//		h.name = "新井";
//		h.age = 20;
//		h.eat();
		
		Arai a = (Arai)h;
		a.name = "新井";
		a.age = 20;
		a.cook();
		a.eat();
		
		System.out.println(a instanceof Arai);
		System.out.println(h instanceof Arai);
		System.out.println(a instanceof Human);
		
		Okada o = new Okada();
		System.out.println(a instanceof Okada);
		
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
