package mon;

import java.util.Scanner;

public class Mondai05_01 {

	public static void main(String[] args) {
		//キーボード入力ができるようにするおまじない
		Scanner scan = new Scanner(System.in);
		
		//キーボードから三角形の底辺の入力
		System.out.print("三角形の底辺を入力してください：");
		int bottom = scan.nextInt();
		
		//キーボードから三角形の高さの入力
		System.out.print("三角形の高さを入力してください：");
		int height = scan.nextInt();
		
		//三角形の面積を求める
		double area = (bottom * height) / 2.0;
		
		System.out.println("三角形の面積：" + area);
		
		scan.close();
	}

}
