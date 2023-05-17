package p01;

public class Sample11 {

	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "20";
		
		//数字（数値文字列）を数値に変換
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		
		System.out.println(s1 + s2);
		System.out.println(x + y);
		
		//数値を数字（数値文字列）に変換
		String s3 = String.valueOf(x);
		String s4 = Integer.toString(y);
		
		System.out.println(s3 + s4);
	}

}
