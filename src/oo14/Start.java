package oo14;

public class Start {

	public static void main(String[] args) {
		//TVクラスを継承したMobileクラスのインスタンスを生成
		Mobile m = new Mobile();
		
		//フィールドに値を設定
		m.ch = 4;
		m.telNo = "090-1111-2222";
		
		//メソッドを実行
		m.show();
		m.talk();
	}

}
