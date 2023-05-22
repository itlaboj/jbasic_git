package oo34;

import java.time.LocalDateTime;

public class Sample05 {

	public static void main(String[] args) {
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(t.getYear());
		System.out.println(t.getMonthValue());
		System.out.println(t.getDayOfMonth());
	}

}
