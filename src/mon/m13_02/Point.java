package mon.m13_02;

public class Point {
	//フィールド
	private int x; //x座標
	private int y; //y座標
	
	//コンストラクタ
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//表示用メソッド
	public void show() {
		System.out.println("x：" + x + "　" + "y：" + y);
	}
}
