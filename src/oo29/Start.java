package oo29;

public class Start {

	public static void main(String[] args) {
		ID[] id = new ID[3];
		
		id[0] = new Arai();
		id[1] = new Okada();
		id[2] = new Nakada();
		
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
