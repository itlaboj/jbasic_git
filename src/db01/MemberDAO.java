package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	//DB接続情報の宣言
	private String url = "jdbc:postgresql:id01"; //DB
	private String user = "postgres";
	private String pass = "himitu";
	
	//全権検索用メソッド
	public List<Member> findAll() {
		try {
			//JDBCドライバ登録
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが利用できません！");
			e.printStackTrace();
		} 
		
		//実行するSQL文
		String sql = "SELECT id, name, age FROM Members";
		
		List<Member> list = new ArrayList<>();
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//SQL文の実行と結果の取得
			ResultSet rs = ps.executeQuery();
			
			
			//カーソルを移動しながらレコードを表示
			while (rs.next() == true) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				Member m =  new Member(id, name, age);
				list.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	//単一検索用メソッド
	public Member find(int _id) {
		try {
			//JDBCドライバ登録
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが利用できません！");
			e.printStackTrace();
		} 
		
		//実行するSQL文
		String sql = "SELECT id, name, age FROM Members WHERE id = ?";
		
		Member m = null;
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダに値を設定
			ps.setInt(1, _id);
			
			//SQL文の実行と結果の取得
			ResultSet rs = ps.executeQuery();
			
			
			//カーソルを移動しながらレコードを表示
			if (rs.next() == true) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				m =  new Member(id, name, age);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}

}
