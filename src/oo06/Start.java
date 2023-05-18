package oo06;

public class Start {

	public static void main(String[] args) {
		Human h1 = new Human("山田太郎", 23);
		
//		h1.name = "山田太郎";
//		h1.age = 23;
		
		h1.introduce();
		h1.walk();
		h1.eat();
		
//		Human h2 = new Human();
//		
////		h2.name = "佐藤二朗";
////		h2.age = 35;
//		
//		h2.introduce();
//		h2.walk();
//		h2.eat();
	}

}
