package oo08;

public class Start {

	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("山田太郎");
		h.setAge(23);
		
		//h.introduce();
		
		String name = h.getName();
		int age = h.getAge();
		
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}

}
