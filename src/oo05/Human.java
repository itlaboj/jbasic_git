package oo05;

public class Human {
	void eat(int money) { //食べる
		System.out.println(money + "円もらったよ！");
		System.out.println("寿司を食べよう！");
		System.out.println();
	}
	
	void eat(String bento) { //食べる
		System.out.println(bento + "をもらったよ！");
		System.out.println("それを食べよう！");
		System.out.println();
	}
	
	void eat() { //食べる
		System.out.println("自腹で食べるよ！");
		System.out.println();
	}
}
