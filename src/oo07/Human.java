package oo07;

public class Human {
	//フィールド（メンバ変数）の定義
	String name; //名前格納用
	int age;     //年齢格納用
	
	//コンストラクタの定義
	Human() {
		
	}
	
	Human(String n, int a) {
		name = n;
		age = a;
	}
	
	//メソッドの定義
	void introduce() { //自己紹介
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}
