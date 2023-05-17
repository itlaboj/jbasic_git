package p02;

public class Sample27 {

	public static void main(String[] args) {
		String[] id = {"岡田", "谷口", "野澤"};
		
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		
		//for (データ型 変数名 : 配列名)
		for (String name : id) {
			System.out.println(name);
		}
	}

}
