package p03;

import java.time.LocalDate;

public class Sample01 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); //実行時（今日）の年月日を取得
		LocalDate tomorrow = now.plusDays(1); //実行時の一日後（明日）の年月日を取得
		LocalDate yesterday = now.minusDays(1); //実行時の一日前（昨日）の年月日を取得
		
		System.out.println(yesterday);
		System.out.println(now);
		System.out.println(tomorrow);
		
		System.out.println(now.isAfter(yesterday)); //今日は昨日の後ですか？・・・true
		System.out.println(now.isAfter(tomorrow)); //今日は明日の後ですか？・・・false
		
		System.out.println(now.isBefore(yesterday)); //今日は昨日の前ですか？・・・false
		System.out.println(now.isBefore(tomorrow)); //今日は明日の前ですか？・・・true
		
		System.out.println(now.compareTo(tomorrow)); //今日 - 明日 = -1
		System.out.println(now.compareTo(yesterday)); //今日 - 昨日 = 1
		System.out.println(now.compareTo(now));  //今日 - 今日 = 0
	}

}
