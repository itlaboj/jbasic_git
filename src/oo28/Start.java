package oo28;

public class Start {

	public static void main(String[] args) {
		ID id;
		
		id = new Arai();
		id.work();
		id.salary();
		
		System.out.println();
		
		id = new Okada();
		id.work();
		id.salary();
		
		System.out.println();
		
		id = new Nakada();
		id.work();
		id.salary();
	}

}
