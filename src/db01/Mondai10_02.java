package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Mondai10_02 {

	public static void main(String[] args) {
		//キーボード入力ができるおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("社員番号を入力してください：");
		int code = scan.nextInt();

		System.out.print("名前を入力してください：");
		String name = scan.next();

		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();

		System.out.print("電話番号を入力してください：");
		String tel = scan.next();

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
		String sql = "INSERT INTO emp VALUES(?, ?, ?, ?)";
		
		try (
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダ「？」の位置に値を設定する
			ps.setInt(1, code);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, tel);
			
			//SQL文の実行と結果の取得
			int rows = ps.executeUpdate();
			
			if (rows == 1) {
				System.out.println(rows + "件、データベースに追加しました。");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("登録失敗");
		}
		
	}

}
