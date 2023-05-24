package exam;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		//Randomクラスのインスタンスを生成
		Random random = new Random();
		
		// プレイヤーとコンピュータの手を決める
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();
		
		// コンピュータは1～3のランダムな数値を取得する
		int com = random.nextInt(3) + 1;
		
		
		// プレイヤーの手とコンピュータの手を比較して勝敗を出力する(5点)
		if (!(1 <= you && you <= 3)) {
			System.out.println("1:グー、2:チョキ、3:パーの範囲で選択してください");
			return;
		}
		
		String youResult = "パー！";
		String comResult = "パー！";
		
		if (you == 1) {
			youResult = "グー！";
		} else if (you == 2) {
			youResult = "チョキ！";
		}
		
		if (com == 1) {
			comResult = "グー！";
		} else if (com == 2) {
			comResult = "チョキ！";
		}
		
		System.out.println("あなたは" + youResult);
		System.out.println("コンピュータは" + comResult);
		
		switch (you) {
		case 1:
			if (com == 1) {
				System.out.println("引き分けでした");
			} else if (com == 2) {
				System.out.println("あなたの勝ち");
			} else if (com == 3) {
				System.out.println("あなたの負け");
			}
			
			break;
			
		case 2:
			if (com == 1) {
				System.out.println("あなたの負け");
			} else if (com == 2) {
				System.out.println("引き分けでした");
			} else if (com == 3) {
				System.out.println("あなたの勝ち");
			}
			
			break;
						
		case 3:
			if (com == 1) {
				System.out.println("あなたの勝ち");
			} else if (com == 2) {
				System.out.println("あなたの負け");
			} else if (com == 3) {
				System.out.println("引き分けでした");
			}
			
			break;
			
		}
	}
}
