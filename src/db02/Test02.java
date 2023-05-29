package db02;

import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		//MemberDAOクラスのインスタンスを生成
		MemberDAO dao = new MemberDAO();
		
		List<Member> list = dao.findAll();
		
		for (Member m : list) {
			int id = m.getId();
			String name = m.getName();
			int age = m.getAge();
			
			System.out.println(id + "\t" + name + "\t" + age);
		}
	}

}
