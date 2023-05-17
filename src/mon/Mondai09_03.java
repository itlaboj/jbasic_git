package mon;

import java.util.Scanner;

public class Mondai09_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("点数を入力してください：");
		int score = scan.nextInt();
		
		judge(score);
	}

	static void judge(int score) {
		if (score >= 70) {
			System.out.println(score + "は合格です。");
		} else {
			System.out.println(score + "は不合格です。");
		}
	}
}
