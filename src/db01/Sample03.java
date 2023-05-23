package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample03 {

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
		
		String sql = "SELECT id, name, age FROM Members";
		
		try (
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement(sql);
		) {
		
			ResultSet rs = ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
