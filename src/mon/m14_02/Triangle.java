package mon.m14_02;

public class Triangle extends Figure {
	//フィールド
	private int bottom; //底辺
	private int height; //高さ
	
	//コンストラクタ
	public Triangle(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}

	@Override
	public void showArea() {
		System.out.println("三角形の面積" + (bottom * height / 2));
	}

}
