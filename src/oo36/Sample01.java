package oo36;

public class Sample01 {

	public static void main(String[] args) {
		int[] list = new int[3];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println();
		
		for (int data : list) {
			System.out.println(data);
		}
	}

}
