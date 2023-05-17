package mon;

public class Mondai09_05 {

	public static void main(String[] args) {
		int[] list = {10, 20, 30, 40, 50};
		
		int result = calc(list);
		System.out.println("合計は" + result);
		
		//System.out.print("合計は" + calc(list));

	}

	static int calc(int[] list) {
		int total = 0;
		
		for (int data : list) {
			total += data;
		}
		
		return total;
	}
}
