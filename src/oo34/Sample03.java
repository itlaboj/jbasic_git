package oo34;

public class Sample03 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("ABC");

		System.out.println(s);
		System.out.println(s.toString());
		
		s.append("XYZ");
		//s.append("12345678901234567");
		
		s.insert(3, "DDD");
		System.out.println(s);
		
		s.replace(3, 6, "EEE");
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s.capacity());
	}

}
