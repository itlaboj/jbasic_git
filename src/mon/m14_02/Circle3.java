package mon.m14_02;

public class Circle3 extends Figure {
	//フィールド
	private int r; //半径
	
	//コンストラクタ
	public Circle3(int r) {
		this.r = r;
	}

	@Override
	public void showArea() {
		System.out.println("円の面積" + (r * r * 3.14));
	}

}
