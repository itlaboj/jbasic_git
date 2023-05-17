package p02;

public class Sample31 {

	public static void main(String[] args) {
		int[] id = {10, 20, -1, 30, -2, 40};
		
		for (int i = 0; i < id.length; i++) {
			if (id[i] < 0) {
				break;
			}
			
			System.out.println(id[i]);
		}

	}

}
