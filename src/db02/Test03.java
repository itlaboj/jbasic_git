package db02;

public class Test03 {

	public static void main(String[] args) {
		//MemberDAOクラスのインスタンスを生成
		MemberDAO dao = new MemberDAO();
		
		//int rows = dao.insert(5, "単", 21);
		int rows = dao.insert(6, "岡田", 20);
		
		if (rows == 1) {
			System.out.println("登録成功");
		} else if (rows == 0) {
			System.out.println("登録失敗");
		}
	}

}
