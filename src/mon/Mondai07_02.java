package mon;

import java.util.Scanner;

public class Mondai07_02 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数値を入力してください：");
		int data = scan.nextInt();
		
		if (data == 1) {
			System.out.println("優です。");
		} else if (data == 2) {
			System.out.println("良です。");
		} else if (data == 3) {
			System.out.println("可です。");
		}
		
		switch(data) {
		case 1:
			System.out.println("優です。");
			break;
		case 2:
			System.out.println("良です。");
			break;
		case 3:
			System.out.println("可です。");
			break;
		}
	}

}
