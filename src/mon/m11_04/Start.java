package mon.m11_04;

public class Start {

	public static void main(String[] args) {
		//Squareクラスのインスタンスを生成
		Square s1 = new Square();
		Square s2 = new Square();
		
		//四角形の幅と高さを設定
		s1.setData(15, 7);
		s2.setData(6);
		
		//表示
		System.out.println("四角形の辺の数は" + Square.sides + "です。");
		System.out.println("s1   高さ：" + s1.height + " 幅：" + s1.width + " 面積：" + s1.getArea());
		System.out.println("s2   高さ：" + s2.height + " 幅：" + s2.width + " 面積：" + s2.getArea());
	}

}
