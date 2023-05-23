package oo36;

public class Sample02 {

	public static void main(String[] args) {
		String[] list = new String[3];
		
		list[0] = "谷口";
		list[1] = "村崎";
		list[2] = "寺内";
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println();
		
		for (String data : list) {
			System.out.println(data);
		}
	}

}
