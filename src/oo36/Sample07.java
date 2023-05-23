package oo36;

import java.util.Random;

public class Sample07 {

	public static void main(String[] args) {
		//乱数生成のプログラム
		
		//Randomクラスのインスタンスを生成
		Random random = new Random();

		//乱数を取得する
		int com = random.nextInt(3) + 1;
		
		System.out.println(com);
	}

}
