package p02;

import java.util.Scanner;

public class Sample30 {

	public static void main(String[] args) {
		//キーボード入力ができるおまじない
		Scanner scan = new Scanner(System.in);
		
		int data; //キーボードから入力したデータを格納する変数
		
		System.out.print("数値を入力してください：");
		
		while ((data = scan.nextInt()) >= 0) {
			System.out.println("入力値：" + data);
			
			System.out.print("数値を入力してください：");
		}
		
		System.out.println("終了");
	}

}
