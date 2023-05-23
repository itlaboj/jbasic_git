package oo36;

import java.util.HashMap;
import java.util.Map;

public class Sample06 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); 

		map.put("k1", "山中");
		map.put("k2", "久保川");
		map.put("k3", "中田");
		
		System.out.println(map.get("k1"));
		System.out.println(map.get("k2"));
		System.out.println(map.get("k3"));
		
		System.out.println();
	
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
