package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Functions {
	
	public static ArrayList<String> searchAdministrator(String tabela) throws SQLException {
		Connection conn = DataBase.DB.getConnection();
		Statement statement = conn.createStatement();
		ArrayList<String> valores = new ArrayList <String> ();

		ResultSet rs = statement.executeQuery("select * from "+tabela);
		
		while(rs.next()) {
			valores.add(rs.getString("name"));
			valores.add(rs.getString("cpf"));
			valores.add(rs.getString("phone"));
			valores.add(rs.getString("cep"));
			valores.add(rs.getString("sex"));
			valores.add(rs.getString("datanascimento"));
			valores.add(rs.getString("salar"));
			valores.add(rs.getString("office"));
			valores.add(rs.getString("login"));
			valores.add(rs.getString("password"));
		}
		
		return valores;
		
		}//searchCommitments final;

}
