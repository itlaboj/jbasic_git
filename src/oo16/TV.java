package oo16;

public class TV {
	//フィールド
	private int ch; //チャンネル
	
	//メソッド
	public void show() {
		System.out.println(ch + "チャンネルの番組を見てるよ！");
	}

	//セッタ＆ゲッタ
	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}
}
