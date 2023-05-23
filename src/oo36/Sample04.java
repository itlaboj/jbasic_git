package oo36;

import java.util.HashSet;
import java.util.Set;

public class Sample04 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for (int data : set) {
			System.out.println(data);
		}
	}

}
