package oo17;

public class Mobile extends TV {
	//フィールド
	private String telNo; //電話番号
	
	//コンストラクタ
	public Mobile(int ch, String telNo) {
		super(ch);
		this.telNo = telNo;
	}
	
	//メソッド
	public void talk() {
		System.out.println(telNo + "：電話中だよ！");
	}

	//セッタ＆ゲッタ
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}
