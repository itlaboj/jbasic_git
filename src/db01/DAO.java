package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	//DB接続情報の宣言
	private String url = "jdbc:postgresql:id01"; //DB
	private String user = "postgres";
	private String pass = "himitu";
	
	//DB接続用メソッド（どのDAOでも共有できるようにする）
	protected Connection connect() throws SQLException {
		try {
			//JDBCドライバ登録
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが利用できません！");
			e.printStackTrace();
		} 
		
		//データベースへの接続
		Connection con = DriverManager.getConnection(url, user, pass);
		
		return con;
	}
	

}
