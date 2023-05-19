package mon.m12_03;

public class Start02 {

	public static void main(String[] args) {
		//Bookクラス型の配列の宣言と領域確保と初期化
		Book[] list = new Book[] {
				new Book("TCP/IP入門", "吉田茂樹", 2200),
				new Book("XMLのすべて", "高橋麻奈", 1800),
				new Book("話せる英文法", "有小山博美", 1500)
		};
		
		//本の情報を表示（for文）
		for (int i = 0; i < list.length; i++) {
			list[i].showBook();
		}
		
		System.out.println();
		
		//本の情報を表示（拡張for文）
		for (Book b : list) {
			b.showBook();
		}

	}

}
