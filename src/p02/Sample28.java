package p02;

public class Sample28 {

	public static void main(String[] args) {
		//配列の宣言と領域の割り当てと初期化
//		String[][] id = new String[][] {
//			{"山中", "中田", "岡田"},
//			{"単", "吉岡", "是村"}
//		};
		
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
