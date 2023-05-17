package p01;

import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		//キーボード入力ができるようにするおまじない
		Scanner scan = new Scanner(System.in);
		
		String name; //名前を格納する変数
		int age; //年齢を格納する変数
		
		System.out.print("名前を入力してください：");
		name = scan.next(); //キーボードから名前（文字列）を入力する
		
		System.out.print("年齢を入力してください：");
		age = scan.nextInt(); //キーボードから年齢（整数値）を入力する
		
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}

}
