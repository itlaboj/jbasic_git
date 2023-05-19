package mon.m12_01;

public class Start {

	public static void main(String[] args) {
		//Bookクラスのインスタンスを生成
		Book b1 = new Book("TCP/IP入門", "吉田茂樹", 2200);
		Book b2 = new Book("XMLのすべて", "高橋麻奈", 1800);
		
		//本の情報を表示
		b1.showBook();
		b2.showBook();		
	}

}
