package oo36;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {

	public static void main(String[] args) {
		//int[] list = new int[3];
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new ArrayList<Integer>();
		//ArrayList<Integer> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		//list[0] = 10;
		//list[1] = 20;
		//list[2] = 30;
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//list.remove(1);
		list.add(2, 50);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for (int data : list) {
			System.out.println(data);
		}
	}

}
