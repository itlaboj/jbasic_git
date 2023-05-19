package oo14;

public class Mobile extends TV {
	//フィールド
	String telNo; //電話番号
	
	//メソッド
	void talk() {
		System.out.println(telNo + "：電話中だよ！");
	}
}
