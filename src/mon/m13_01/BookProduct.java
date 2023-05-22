package mon.m13_01;

public class BookProduct extends Product {
	//フィールド
	String title;     //タイトル
	String publisher; //出版社
	
	void showBook() {
		System.out.println("本のタイトル：" + title);
		System.out.println("出版社：" + publisher);
		super.showPrice();
	}
}
