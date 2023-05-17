package mon;

import java.util.Scanner;

public class Mondai09_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("年を入力してください：");
		int year = scan.nextInt();
		
		if (judge(year) == true) {
			System.out.println(year + "年はうるう年です。");
		} else {
			System.out.println(year + "年はうるう年ではありません。");
		}
	}

	static boolean judge(int year) {
		return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
	}
}
