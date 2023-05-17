package mon;

public class Mondai09_01 {

	public static void main(String[] args) {
		System.out.println("a = " + waru(10, 2));
		System.out.println("b = " + waru(10, 3.0));
		System.out.println("c = " + waru(10.0, 4));
		System.out.println("d = " + waru(10.0, 5.0));
	}

	static double waru(double x, double y) {
		return x / y;
	}
}
