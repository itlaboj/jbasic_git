package oo04;

public class Member {
	//フィールドの定義
	String myGoal; //個人の目標
	static String teamGoal; //チームの目標
	
	//メソッドの定義
	void display() {
		System.out.println("個人の目標：" + myGoal);
		System.out.println("チームの目標：" + teamGoal);
		System.out.println();
	}
	
	static void test() {
		System.out.println("山田太郎");
		//System.out.println(myGoal);
		System.out.println(teamGoal);
		
		//display();
	}
}
