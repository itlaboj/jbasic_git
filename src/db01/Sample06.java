package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample06 {

	public static void main(String[] args) {
		//DB接続情報の宣言
		String url = "jdbc:postgresql:id01"; //DB
		String user = "postgres";
		String pass = "himitu";
		
		try {
			//JDBCドライバ登録
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが利用できません！");
			e.printStackTrace();
		} 
		
		//実行するSQL文
		String sql = "UPDATE Members SET age = 23 WHERE id = 4";
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//SQL文の実行と結果の取得
			int rows = ps.executeUpdate();
			
			if (rows == 1) {
				System.out.println("変更成功！");
			} else {
				System.out.println("変更失敗");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
