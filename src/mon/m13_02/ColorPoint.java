package mon.m13_02;

public class ColorPoint extends Point {
	//フィールド
	private String color; //色
	
	//コンストラクタ
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	//表示用メソッド
	public void show() {
		super.show();
		System.out.println("color：" + color);
	}
}
