package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Class.Employee;

public class Functions {
	
	public static ArrayList<Employee> searchEmployeeAdvanced(String tabela) throws SQLException {
		Connection conn = DataBase.DB.getConnection();
		Statement statement = conn.createStatement();
//		ArrayList<String> valores = new ArrayList <String> ();
		ArrayList<Employee> employees = new ArrayList<>();

		ResultSet rs = statement.executeQuery("select * from "+tabela);
		
		while(rs.next()) {
			employees.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3),
										rs.getString(4), rs.getString(5), rs.getString(6), 
										rs.getString(7), Double.parseDouble(rs.getString(8)), 
										rs.getString(9)));
			
			/*valores.add(rs.getString("name"));
			valores.add(rs.getString("cpf"));
			valores.add(rs.getString("phone"));
			valores.add(rs.getString("cep"));
			valores.add(rs.getString("sex"));
			valores.add(rs.getString("datanascimento"));
			valores.add(rs.getString("salar"));
			valores.add(rs.getString("office"));
			valores.add(rs.getString("login"));
			valores.add(rs.getString("password"));*/
		}
		
		return employees;
		
		}//searchCommitments final;

}
