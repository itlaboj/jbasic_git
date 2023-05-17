package mon;

import java.util.Scanner;

public class Mondai08_04 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in)
				;
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "人目の点数：");
			score[i] = scan.nextInt();
		}
		
		int max = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.println("最高得点は" + max + "です。");
	}

}
