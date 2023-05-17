package p01;

public class Sample12 {

	public static void main(String[] args) {
		//配列の宣言
		//let id = [];・・・JavaScript
		//データ型[] 配列名;・・・Java
		String[] id;
		
		//配列の領域の割り当て
		//配列名 = new データ型[要素数];
		id = new String[3];
		
		//配列にデータを設定
		id[0] = "山中";
		id[1] = "中田";
		id[2] = "岡田";
		
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
	}

}
