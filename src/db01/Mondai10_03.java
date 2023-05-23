package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Mondai10_03 {

	public static void main(String[] args) {
		//キーボード入力ができるおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を一部を入力してください：");
		String part = scan.next();
		
		//DB接続情報の宣言
		String url = "jdbc:postgresql:mondai_db"; //DB
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
		String sql = "SELECT code, name, age, tel FROM emp WHERE name LIKE ?";
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダ「？」の位置に値を設定する
			ps.setString(1, "%" + part + "%");
			
			//SQL文の実行と結果の取得
			ResultSet rs = ps.executeQuery();
			
			//カーソルを移動しながらレコードを表示
			while (rs.next() == true) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String tel = rs.getString("tel");
				
				System.out.println(code + "：" + name + "：" + age + "：" + tel);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
