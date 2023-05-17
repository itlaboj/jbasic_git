package mon;

import java.util.Scanner;

public class Mondai05_03 {

	public static void main(String[] args) {
		//キーボード入力ができるようにするおまじない
		Scanner scan = new Scanner(System.in);
		
		//キーボードから英語の得点の入力
		System.out.print("英語：");
		int eng = scan.nextInt();
		
		//キーボードから数学の得点の入力
		System.out.print("数学：");
		int math = scan.nextInt();
		
		//キーボードから理科の得点の入力
		System.out.print("理科：");
		int sci = scan.nextInt();
		
		//得点の合計を求める
		int total = eng + math + sci;
		
		//得点の平均を求める
		double ave = total / 3.0;
		
		//合計と平均の表示
		System.out.println("合計：" + total);
		System.out.println("平均：" + ave);
	}

}
