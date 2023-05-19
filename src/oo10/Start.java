package oo10;

public class Start {

	public static void main(String[] args) {
		Human h1 = new Human("山田太郎", 23);
		Human h2 = new Human("佐藤次郎", 35);
		
		h1.introduce();
		h2.introduce();
		
		System.out.println();
		
		h2 = h1;
		
		h1.introduce();
		h2.introduce();
		
		h2.setAge(100);
		
		System.out.println();

		h1.introduce();
		h2.introduce();
		
	}

}
