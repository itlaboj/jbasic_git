package p01;

public class Sample04 {

	public static void main(String[] args) {
//		double p01 = 3.14;
//		float p02 = 3.14F;
		
		double p01 = 3.14;
		float p02 = (float)p01;
		double p03 = p02;
		
		System.out.println(p01);
		System.out.println(p02);
		
		int a = 2_100_000_000;
		long b = 2_200_000_000L;
		boolean c = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
