package oo01;

public class Start {

	public static void main(String[] args) {
		//①Humanクラスを参照する参照変数の定義
		//Humanというモノを操作するリモコンの定義
		Human h;
		
		//②Humanクラスのインスタンスを生成して参照変数で参照する。
		//Humanというモノを作ってリモコンで操作ができるようにする。
		h = new Human();
		
		//③Humanクラスのnameとageに値を設定する。
		h.name = "山田太郎";
		h.age = 23;
		
		//④Humanクラスのメソッドを実行
		h.introduce();
		h.walk();
		h.eat();
	}

}
