package p01;

public class Sample13 {

	public static void main(String[] args) {
		//配列の宣言と領域の割り当て
		String[] id = new String[3];
		
		//配列にデータを設定
		id[0] = "山中";
		id[1] = "中田";
		id[2] = "岡田";
		
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id.length);
	}

}
