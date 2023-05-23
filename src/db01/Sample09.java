package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample09 {

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
		//String sql = "INSERT INTO Members VALUES(4, '谷口', 22)";
		String sql = "INSERT INTO Members VALUES(?, ?, ?)";
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダ「？」の位置に値を設定する
			ps.setInt(1, 4);
			ps.setString(2, "谷口");
			ps.setInt(3, 22);
			
			//SQL文の実行と結果の取得
			int rows = ps.executeUpdate();
			
			if (rows == 1) {
				System.out.println("登録成功！");
			} else {
				System.out.println("登録失敗");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("登録失敗");
		}
		
	}

}
