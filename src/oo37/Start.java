package oo37;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
//		ID[] id = new ID[] {
//			new Arai(),
//			new Okada(),
//			new Nakada()
//		};
		
		List<ID> list = new ArrayList<>();
		
		list.add(new Arai());
		list.add(new Okada());
		list.add(new Nakada());
		
		for (int i = 0; i < list.size(); i++) {
			ID id = list.get(i); //list[i]
			
			id.work();
			id.salary();
		}
		
		System.out.println();
		
		for (ID id : list) {
			id.work();
			id.salary();
		}
	}

}
