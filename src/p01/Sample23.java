package p01;

public class Sample23 {

	public static void main(String[] args) {
		char data = 'A';
		
		switch (data) {
		case 'A':
			System.out.println("Aです。");
			break;
		case 'B':
			System.out.println("Bです。");
			break;
		case 'C':
			System.out.println("Cです。");
			break;
		default:
			System.out.println("該当なし");	
			break;
		}
		
//		if (data == 1) {
//			System.out.println("１です。");
//		} else if (data == 2) {
//			System.out.println("２です。");
//		} else if (data == 3) {
//			System.out.println("３です。");
//		} else {
//			System.out.println("該当なし");	
//		}
		
	}

}
