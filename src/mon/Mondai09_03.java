package mon;

import java.util.Scanner;

public class Mondai09_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("点数を入力してください：");
		int score = scan.nextInt();
		
		String result = judge(score);
		System.out.println(score + "は" + result + "です。");
	}

	static String judge(int score) {
		String result = "不合格";
		
		if (score >= 70) {
			result = "合格";
		}
		
		return result;
	}
	
//	static String judge(int score) {
//		if (score >= 70) {
//			return "合格";
//		} else {
//			return "不合格";
//		}
//	}
}
