package oo06;

public class Start {

	public static void main(String[] args) {
		Human h = new Human();
		//Human h1 = new Human("山田太郎", 23);
		
		h.name = "山田太郎";
		h.age = 23;
		
		h.introduce();
	}

}
