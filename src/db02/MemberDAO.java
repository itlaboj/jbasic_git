package db02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO extends DAO {
	
	//全権検索用メソッド
	public List<Member> findAll() {
		//実行するSQL文
		String sql = "SELECT id, name, age FROM Members";
		
		List<Member> list = new ArrayList<>();
		
		try (
			//データベースへの接続
			Connection con = connect();
				
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
		} catch (Exception e) { //} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	//単一検索用メソッド
	public Member find(int _id) {
		//実行するSQL文
		String sql = "SELECT id, name, age FROM Members WHERE id = ?";
		
		Member m = null;
		
		try (
			//データベースへの接続
			Connection con = connect();
				
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
			
		} catch (Exception e) { //} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}

	//登録用メソッド
	public int insert(int id, String name, int age) {
		//実行するSQL文
		String sql = "INSERT INTO Members VALUES(?, ?, ?)";
		
		int rows = 0;
		
		try (
			//データベースへの接続
			Connection con = connect();
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダに値を設定
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			con.setAutoCommit(false); //TRANSACTION START;
			
			//SQL文の実行と結果の取得
			rows = ps.executeUpdate();
			
			if (rows == 1) {
				con.commit();
			} else {
				con.rollback();
			}
		} catch (Exception e) { //} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}
	
	//変更用メソッド
	public int update(int id, String name, int age) {
		//実行するSQL文
		String sql = "UPDATE Members SET name = ?, age = ? WHERE id = ?";
		
		int rows = 0;
		
		try (
			//データベースへの接続
			Connection con = connect();
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダに値を設定
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setInt(3, id);
			
			con.setAutoCommit(false); //TRANSACTION START;
			
			//SQL文の実行と結果の取得
			rows = ps.executeUpdate();
			
			if (rows != 0) {
				con.commit();
			} else {
				con.rollback();
			}
		} catch (Exception e) { //} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}
	
	//削除用メソッド
	public int delete(int id) {
		//実行するSQL文
		String sql = "DELETE FROM Members WHERE id = ?";
		
		int rows = 0;
		
		try (
			//データベースへの接続
			Connection con = connect();
				
			//SQL文の実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
		) {
			//プレースホルダに値を設定
			ps.setInt(1, id);
			
			con.setAutoCommit(false); //TRANSACTION START;
			
			//SQL文の実行と結果の取得
			rows = ps.executeUpdate();
			
			if (rows != 0) {
				con.commit();
			} else {
				con.rollback();
			}
		} catch (Exception e) { //} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}
}
