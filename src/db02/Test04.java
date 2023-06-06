package db02;

public class Test04 {

	public static void main(String[] args) {
		//MemberDAOクラスのインスタンスを生成
		MemberDAO dao = new MemberDAO();
		
		//int rows = dao.insert(5, "単", 21);
		int rows = dao.update(6, "寺迫", 26);
		
		if (rows != 0) {
			System.out.println("変更成功");
		} else if (rows == 0) {
			System.out.println("変更失敗");
		}
	}

}
