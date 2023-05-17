package p01;

public class Sample15 {

	public static void main(String[] args) {
		//配列の宣言と領域の割り当てと初期化
		//String[] id = {"山中", "中田", "岡田"};
		String[] id;
		id = new String[]{"山中", "中田", "岡田"};
		
		//配列にデータを設定
		//id[0] = "単";
		//id[3] = "中田";
//		id[2] = "岡田";
		
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id.length);
	}

}
