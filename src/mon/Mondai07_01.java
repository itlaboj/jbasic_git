package mon;

import java.util.Scanner;

public class Mondai07_01 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("月を入力してください：");
		int month = scan.nextInt();
		
		if (1 <= month && month <= 12) {
			System.out.println(month + "月は正しい月です。");
		} else {
			System.out.println(month + "月は正しくない月です。");
		}
	}

}
