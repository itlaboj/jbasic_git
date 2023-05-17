package p01;

public class Sample16 {

	public static void main(String[] args) {
		//配列の宣言
		String[][] id;
		
		//領域の割り当て
		id = new String[2][3];
		
		//配列にデータを設定
		id[0][0] = "山中";
		id[0][1] = "中田";
		id[0][2] = "岡田";
		id[1][0] = "単";
		id[1][1] = "吉岡";
		id[1][2] = "是村";
		
		System.out.println(id[0][0]);
		System.out.println(id[0][1]);
		System.out.println(id[0][2]);
		System.out.println(id[1][0]);
		System.out.println(id[1][1]);
		System.out.println(id[1][2]);
	}

}
