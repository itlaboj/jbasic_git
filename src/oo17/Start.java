package oo17;

public class Start {

	public static void main(String[] args) {
		//TVクラスを継承したMobileクラスのインスタンスを生成
		Mobile m = new Mobile(4, "090-1111-2222");
		
		//フィールドに値を設定
//		m.setCh(4);
//		m.setTelNo("090-1111-2222");
		
		//メソッドを実行
		m.show();
		m.talk();
	}

}
