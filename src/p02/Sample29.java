package p02;

import java.util.Scanner;

public class Sample29 {

	public static void main(String[] args) {
		//キーボード入力ができるおまじない
		Scanner scan = new Scanner(System.in);
		
		int data; //キーボードから入力したデータを格納する変数
		
		do {
			System.out.print("数値を入力してください：");
			data = scan.nextInt();
			
			System.out.println("入力値：" + data);
		} while (data >= 0);
		
		System.out.println("終了");
	}

}
