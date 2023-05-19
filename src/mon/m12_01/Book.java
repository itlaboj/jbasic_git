package mon.m12_01;

public class Book {
	//フィールド
	String title; //本のタイトル
	String author; //著者
	int price; //価格
	
	//コンストラクタ
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//メソッド
	void showBook() {
		System.out.print("タイトル：" + title + "　");
		System.out.print("著者：" + author + "　");
		System.out.println("価格：" + price + "円");
	}

}
