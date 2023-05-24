package exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		//キーボードから名前と年齢を入力
		System.out.print("名前：");
		String name = scan.next();
		
		System.out.print("年齢：");
		int age = scan.nextInt();
		
		//名前と10年後の年齢を表示
		System.out.println(name + "さんの10年後は" + (age + 10) + "歳です！");
	}

}
