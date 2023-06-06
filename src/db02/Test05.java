package db02;

public class Test05 {

	public static void main(String[] args) {
		//MemberDAOクラスのインスタンスを生成
		MemberDAO dao = new MemberDAO();
		
		//int rows = dao.insert(5, "単", 21);
		int rows = dao.delete(6);
		
		if (rows != 0) {
			System.out.println("削除成功");
		} else if (rows == 0) {
			System.out.println("削除失敗");
		}
	}

}
