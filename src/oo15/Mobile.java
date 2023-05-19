package oo15;

public class Mobile extends TV {
	//フィールド
	private String telNo; //電話番号
	
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
