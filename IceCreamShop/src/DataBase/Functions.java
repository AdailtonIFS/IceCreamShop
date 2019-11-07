package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Functions {
	
	/*
	 * Classe com o objetivo de armazenar as
	 * funções que uso para manipular o Banco de Dados
	 */
	
	
	/*
	 * 
	 * Função de contagem de registros 
	 * do meu Banco de Dados.
	 * 
	 */
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
	
	/*
	 * 
	 * Função para logar no sistema 
	 * 
	 */
	
	public static ArrayList<Object> validarLogin(String tabela,String login, String senha) throws SQLException {
		
		Connection conn = DataBase.DB.getConnection();
		Statement statement = conn.createStatement();
		ArrayList<Object> valores = new ArrayList <Object> ();
		String sql = String.format("select office,type,cpf from %s where login = '%s' and password = '%s'",tabela,login,senha);

		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()) {
			
			valores.add(rs.getString("office"));
			valores.add(rs.getString("type"));
			valores.add(rs.getString("cpf"));
		}
		

		return valores;
		
		}
	
	
	
	/*
	 * 
	 * Função que busca os
	 * dados dos funcionários
	 * no Banco de Dados
	 *
	 */
	public static ArrayList<Object> buscarDadosFuncionario(String tabela) throws SQLException {
		
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
					valores.add(rs.getString("borndate"));
					valores.add(rs.getString("salar"));
					valores.add(rs.getString("office"));
					valores.add(rs.getString("sex"));
					valores.add(rs.getString("type"));
					valores.add(rs.getString("login"));
					valores.add(rs.getString("password"));
			}
		
		return valores;
		
	}
	
	
	/*
	 * 
	 * Função que busca os
	 * dados dos clientes
	 * no Banco de Dados
	 *
	 */
	
	
	public static ArrayList<Object> buscarDadosCliente(String tabela) throws SQLException {
		
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
			valores.add(rs.getString("borndate"));
			valores.add(rs.getString("email"));
			valores.add(rs.getString("sex"));
		}
		
		return valores;
		
		}
	
	/*
	 * 
	 * Função que deleta
	 * um registro
	 * no Banco de Dados
	 *
	 */
	
	public static void delete(String tabela, String chavePrimaria, String valor) throws SQLException {
		
		Connection conn = DataBase.DB.getConnection();
		String sql;
		Statement statement = conn.createStatement();

		sql = String.format("delete from %s where %s = '%s'", tabela, chavePrimaria, valor);

		statement.executeUpdate(sql);
		DataBase.DB.closeStatement(statement);
	}	
	
	
	/*
	 * 
	 * Função que registra
	 * no Banco de Dados
	 *
	 */
	
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
