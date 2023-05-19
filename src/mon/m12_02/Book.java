package mon.m12_02;

public class Book {
	//フィールド
	private String title; //本のタイトル
	private String author; //著者
	private int price; //価格
	
	//コンストラクタ
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//メソッド
	public void showBook() {
		System.out.print("タイトル：" + title + "　");
		System.out.print("著者：" + author + "　");
		System.out.println("価格：" + price + "円");
	}

	//アクセッサ（セッタ＆ゲッタ）
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
