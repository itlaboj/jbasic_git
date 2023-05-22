package mon.m14_02;

public class Start {

	public static void main(String[] args) {
		Figure[] list = new Figure[3];
		
		list[0] = new Circle3(10);
		list[1] = new Triangle(10, 20);
		list[2] = new Square5(20, 10);
		
		for (int i = 0; i < list.length; i++) {
			list[i].showArea();
		}
		
		System.out.println();
		
		for (Figure f : list) {
			f.showArea();
		}
	}

}
