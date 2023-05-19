package mon.m12_03;

public class Start {

	public static void main(String[] args) {
		//Bookクラス型の配列の宣言と領域確保
		Book[] list = new Book[3];
		
		//配列listの0～2にBookクラスのインスタンスを格納
		list[0] = new Book("TCP/IP入門", "吉田茂樹", 2200);
		list[1] = new Book("XMLのすべて", "高橋麻奈", 1800);
		list[2] = new Book("話せる英文法", "有小山博美", 1500);
		
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
