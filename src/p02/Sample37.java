package p02;

public class Sample37 {

	public static void main(String[] args) {
		//メソッドの呼び出し
		tan01();
		tan02("単");
		String n1 = tan03();
		System.out.println(n1);
		//System.out.println(tan03());
		String n2 = tan04("単");
		System.out.println(n2);
		System.out.println(tan04("単"));
	}
	
	//メソッドの定義
	static String tan04(String name) { //引数あり、戻り値がある
		return name + "文潔";
	}

	static String tan03() { //引数なし、戻り値がある
		String name = "単";
		
		return name;
	}

	static void tan02(String name) { //引数あり、戻り値がない
		//String name = "単";
		System.out.println(name);
	}

	static void tan01() { //引数なし、戻り値がない
		String name = "単";
		System.out.println(name);
	}

}
