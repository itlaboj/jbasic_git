package mon;

import java.util.Scanner;

public class Mondai05_02 {

	public static void main(String[] args) {
		//キーボード入力ができるようにするおまじない
		Scanner scan = new Scanner(System.in);
		
		//キーボードから値段の入力
		System.out.print("商品の値段を入力してください：");
		int price = scan.nextInt();
		
		//消費税を求める
		int tax = (int)(price * 0.1);
		
		//税込みの値段を求める
		int total = price + tax;
		
		System.out.println("消費税（10%）込みの値段：" + total);
	}

}
