package p01;

public class Sample03 {

	public static void main(String[] args) {
		//変数宣言と値の代入
		String name = "山田太郎"; //名前格納用変数
		int age = 1_000_000; //年齢格納用変数
		//char blood = 65;
		//char blood = 0x41;
		char blood = 0b0100_0001;
		
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("血液型：" + blood);
	}

}
