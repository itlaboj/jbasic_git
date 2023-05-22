package mon.m13_03;

public class Start {

	public static void main(String[] args) {
		//Pointクラス型の配列の宣言と領域確保
		Point[] list = new Point[4];
		
		list[0] = new Point(3, 9);
		list[1] = new ColorPoint(12, -3, "RED");
		list[2] = new Point(56, 2);
		list[3] = new ColorPoint(7, -28, "BLUE");
		
		for (int i = 0; i < list.length; i++) {
			list[i].show();
			System.out.println();
		}
		
//		for (Point p : list) {
//			p.show();
//			System.out.println();
//		}
	}

}
