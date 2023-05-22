package mon.m13_01;

public class Start {

	public static void main(String[] args) {
		//BookProductクラスのインスタンスを生成
		BookProduct b = new BookProduct();
		
		//フィールドに値を設定
		b.title = "刑事コロンボ";
		b.publisher = "ABC出版";
		b.price = 1400;
		
		//メソッド実行
		b.showBook();
	}

}
