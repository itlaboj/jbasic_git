package exam;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("年齢を入力してください：");
		int age = 0; // 初期値
		
		
		// 文字列が入力された場合は「整数で入力してください」と出力する（5点）
		// 0以上130以下の範囲外である場合は「0以上130以下で入力してください」
		// と出力する（5点）
		// 0以上130以下の整数だった場合は「○歳で登録しました」と出力する（5点）
		
		try {
			age = Integer.parseInt(scan.next()); //数字を文字列で入力して整数に変換
			
			if (!(0 <= age && age <= 130)) {
				System.out.println("0以上130以下で入力してください");
			} else {
				System.out.println(age + "歳で登録しました");
			}
	
		} catch (NumberFormatException e) {
			System.out.println("整数で入力してください");
		}
		
//		try {
//			age = Integer.parseInt(scan.next()); //数字を文字列で入力して整数に変換
//			
//			if (!(0 <= age && age <= 130)) {
//				throw new Exception("0以上130以下で入力してください");
//			}
//			
//			System.out.println(age + "歳で登録しました");
//	
//		} catch (NumberFormatException e) {
//			System.out.println("整数で入力してください");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		scan.close();
	}
}
