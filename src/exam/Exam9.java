package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		//HashMapのインスタンスを生成
		Map<String, String> map = new HashMap<>();
		
		int select;
		String name;
		String tel;
		
		do {
			System.out.println("1：登録 2：削除 3：一覧表示 9：終了");
			System.out.print("操作番号を入力してください：");
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("名前を入力してください：");
				name = scan.next();
				
				System.out.print("電話番号を入力してください：");
				tel = scan.next();
				
				map.put(name, tel);
				
				break;
			case 2:
				System.out.print("名前を入力してください：");
				name = scan.next();
				
				map.remove(name);
				
				break;
			case 3:
				System.out.println("名前\t電話番号");
				System.out.println("-----------------");
				
				for (String key : map.keySet()) {
					System.out.println(key + "\t" + map.get(key));
				}
			}
			
			System.out.println();
			
		} while (select != 9);
		
		System.out.println("アプリケーションを終了します");
	}
}
