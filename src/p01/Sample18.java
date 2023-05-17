package p01;

public class Sample18 {

	public static void main(String[] args) {
		//配列の宣言と領域の割り当てと初期化
		String[][] id = new String[][] {
			{"山中", "中田", "岡田"},
			{"単", "吉岡", "是村"}
		};
		
		System.out.println(id[0][0]);
		System.out.println(id[0][1]);
		System.out.println(id[0][2]);
		System.out.println(id[1][0]);
		System.out.println(id[1][1]);
		System.out.println(id[1][2]);
	}

}
