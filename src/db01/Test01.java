package db01;

public class Test01 {

	public static void main(String[] args) {
		//MemberDAOクラスのインスタンスを生成
		MemberDAO dao = new MemberDAO();
		
		Member m = dao.find(2);
		
		if (m != null) {
			int id = m.getId();
			String name = m.getName();
			int age = m.getAge();
			
			System.out.println(id + "\t" + name + "\t" + age);
		} else {
			System.out.println("指定したIDのレコードがありません。");
		}
	}

}
