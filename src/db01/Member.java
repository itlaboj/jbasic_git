package db01;

import java.io.Serializable;

//Membersテーブルの１レコードの情報を格納するクラス
public class Member implements Serializable {
	//フィールド
	private int id; //ID
	private String name; //名前
	private int age; //年齢
	
	//コンストラクタ
	public Member() {
		
	}
	
	public Member(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//セッタ＆ゲッタ
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
