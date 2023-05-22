package oo34;

public class Sample02 {

	public static void main(String[] args) {
		String s1 = "ABCXYZABC";

		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1, 3));
		System.out.println(s1.indexOf("XYZ"));
		System.out.println(s1.indexOf("ABC"));
		System.out.println(s1.lastIndexOf("ABC"));
		
		String s2 = "ABCXYZ";
		
		System.out.println(s2.startsWith("ABC"));
		System.out.println(s2.startsWith("AAA"));
		System.out.println(s2.startsWith("BC", 1));
		System.out.println(s2.endsWith("XYZ"));
		System.out.println(s2.endsWith("XXX"));
		
		System.out.println();
		
		//String s3 = new String("ABC");
		String s3 = "ABC";
		
		System.out.println(s3 == "ABC");
		System.out.println(s3.equals("ABC"));
		System.out.println(s3.concat("XYZ"));
		System.out.println(s3 + "XYZ");
		
		String s4 = " ABC ";
		
		System.out.println(s4);
		System.out.println(s4.trim());
		
		String s5 = "ABCxyz";
		
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());


	}

}
