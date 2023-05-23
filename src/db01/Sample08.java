package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample08 {

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
		
		int _id = 2;
		
		//実行するSQL文
		String sql = "SELECT id, name, age FROM Members WHERE id = ?";
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダ「？」の場所に値を設定する
			ps.setInt(1, _id);
			
			//SQL文の実行と結果の取得
			ResultSet rs = ps.executeQuery();
			
			//カーソルを移動しながらレコードを表示
			if (rs.next() == true) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println(id + "\t" + name + "\t" + age);
			} else {
				System.out.println("指定したIDのレコードがありません。");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
