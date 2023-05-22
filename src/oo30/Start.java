package oo30;

public class Start {

	public static void main(String[] args) {
		ID[] id = new ID[] {
			new Arai(),
			new Okada(),
			new Nakada()
		};
		
		for (int i = 0; i < id.length; i++) {
			id[i].work();
			id[i].salary();
		}
		
		System.out.println();
		
		for (ID i : id) {
			i.work();
			i.salary();
		}
	}

}
