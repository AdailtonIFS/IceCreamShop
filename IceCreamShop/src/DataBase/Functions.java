package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Functions {
	
	public static int countQuantiy(String tabela) throws SQLException {

		Connection conn = DataBase.DB.getConnection();
		Statement statement = conn.createStatement();
	
		int resultado = 0;
		
		ResultSet rs = statement.executeQuery("select count (*) from "+tabela);

		
		if(rs.next()) {
			resultado = rs.getInt(1);
		}
		return resultado;
	}
	
	
	
	
	public static ArrayList<Object> searchEmployee(String tabela) throws SQLException {
		
		Connection conn = DataBase.DB.getConnection();
		Statement statement = conn.createStatement();
		ArrayList<Object> valores = new ArrayList <Object> ();
		String sql = String.format("select * from %s order by name",tabela);

		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()) {

			valores.add(rs.getString("name"));
			valores.add(rs.getString("cpf"));
			valores.add(rs.getString("phone"));
			valores.add(rs.getString("adress"));
			valores.add(rs.getString("cep"));
			valores.add(rs.getString("sex"));
			valores.add(rs.getString("borndate"));
			valores.add(rs.getDouble("salar"));
			valores.add(rs.getString("office"));
			valores.add(rs.getString("type"));
			valores.add(rs.getString("login"));
			valores.add(rs.getString("password"));
		}
		
		return valores;
		
		}//searchCommitments final;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static ArrayList<Object> searchClient(String tabela) throws SQLException {
		Connection conn = DataBase.DB.getConnection();
		Statement statement = conn.createStatement();
		ArrayList<Object> valores = new ArrayList <Object> ();
		String sql = String.format("select * from %s order by name",tabela);

		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()) {
			
			valores.add(rs.getString("name"));
			valores.add(rs.getString("cpf"));
			valores.add(rs.getString("phone"));
			valores.add(rs.getString("adress"));
			valores.add(rs.getString("cep"));
			valores.add(rs.getString("datanascimento"));
			valores.add(rs.getString("email"));
			valores.add(rs.getString("sex"));
		}
		
		return valores;
		
		}//searchCommitments final;
	
	public static void delete(String tabela, String chavePrimaria, String valor) throws SQLException {
		
		Connection conn = DataBase.DB.getConnection();
		String sql;
		Statement statement = conn.createStatement();

		sql = String.format("delete from %s where %s = '%s'", tabela, chavePrimaria, valor);

		statement.executeUpdate(sql);
		DataBase.DB.closeStatement(statement);
	}	
	
	
	
	
	public static void register(String tabela, ArrayList<Object> valores) throws SQLException {
		
		Connection conn = DataBase.DB.getConnection();
		String sql;
		Statement statement = conn.createStatement();

		sql = String.format("insert into %s values (", tabela);

		for (Object valor : valores) {
			sql += "'" +valor + "',";
		}

		sql = sql.substring(0, sql.length() - 1) + ")"
				+ "";

		statement.executeUpdate(sql);
		DataBase.DB.closeStatement(statement);
		
		}
	
	

}
