package mon;

import java.util.Scanner;

public class Mondai07_03 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("降水確率を入力してください：");
		int rainyPercent = scan.nextInt();
		
		if (rainyPercent >= 70) {
			System.out.println("傘を必ず持っていきましょう。");
		} else if (20 <= rainyPercent && rainyPercent < 70) {
			System.out.println("傘はあったほうがいいかも。");
		} else if (rainyPercent < 20) {
			System.out.println("傘はいらないでしょう。");
		}
		
		if (70 <= rainyPercent && rainyPercent <= 100) {
			System.out.println("傘を必ず持っていきましょう。");
		} else if (20 <= rainyPercent && rainyPercent < 70) {
			System.out.println("傘はあったほうがいいかも。");
		} else if (0 <= rainyPercent && rainyPercent < 20) {
			System.out.println("傘はいらないでしょう。");
		}
	}

}
