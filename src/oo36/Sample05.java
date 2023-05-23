package oo36;

import java.util.Set;
import java.util.TreeSet;

public class Sample05 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("CCC");
		set.add("AAA");
		set.add("DDD");
		set.add("BBB");
		
		for (String data : set) {
			System.out.println(data);
		}
	}

}
