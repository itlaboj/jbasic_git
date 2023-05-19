package oo09;

public class Human {
	//フィールド（メンバ変数）の定義
	private String name; //名前格納用
	private int age;     //年齢格納用
	
	//コンストラクタの定義
	public Human() {
		
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//メソッドの定義
	void introduce() { //自己紹介
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}


	//アクセッサ（セッタ＆ゲッタ）の定義
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
