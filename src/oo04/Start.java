package oo04;

public class Start {

	public static void main(String[] args) {
		//３名のメンバーのインスタンスを生成
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		//個人の目標とチームの目標を設定
		m1.myGoal = "分析を頑張る！";
		m1.teamGoal = "みんなで頑張る！";
		
		m2.myGoal = "設計を頑張る！";
		m2.teamGoal = "みんなで頑張る！";
		
		m3.myGoal = "実装を頑張る！";
		m3.teamGoal = "みんなで頑張る！";
		
		//個人の目標とチームの目標を表示
		m1.display();
		m2.display();
		m3.display();
		
		m2.myGoal = "設計と実装を頑張る！";
		Member.teamGoal = "みんなで全力で頑張る！";

		//個人の目標とチームの目標を表示
		m1.display();
		m2.display();
		m3.display();
		
		Member.test();
	}

}
