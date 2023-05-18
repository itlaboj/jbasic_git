package mon.m11_04;

public class Square {
	//フィールド
	int height; //高さ
	int width;  //幅
	static int sides = 4; //辺の数
	
	//メソッド
	int getArea() {
		return height * width;
	}
	
	void setData(int h, int w) {
		height = h;
		width = w;
	}
	
	void setData(int len) {
		height = len;
		width = len;
	}
}
