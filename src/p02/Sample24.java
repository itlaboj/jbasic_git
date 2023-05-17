package p02;

import java.util.Scanner;

public class Sample24 {

	public static void main(String[] args) {
		//キーボード入力できるおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("文字列を入力してください：");
		String moji = scan.next();
		
		switch (moji) {
		case "みかん":
		case "りんご":
		case "いちご":
			System.out.println("フルーツです。");
			break;
		case "犬":
		case "ねこ":
		case "ねずみ":
			System.out.println("動物です。");
			break;
		default:
			System.out.println("該当なし");	
			break;
		}
	}

}
