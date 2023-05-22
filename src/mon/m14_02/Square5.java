package mon.m14_02;

public class Square5 extends Figure {
	//フィールド
	private int tate; //縦
	private int yoko; //横
	
	//コンストラクタ
	public Square5(int tate, int yoko) {
		this.tate = tate;
		this.yoko = yoko;
	}

	@Override
	public void showArea() {
		System.out.println("四角形の面積" + (tate * yoko));
	}

}
