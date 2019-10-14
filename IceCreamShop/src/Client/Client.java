package Client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import IceCreamShop.Person;

public class Client extends Person {
	
			//============= ATRIBUTOS =============
			private String Email;//ATRIBUTO EMAIL
			//--------------------------------------
				
			public String getEmail() {
				return Email;
			}

			public void setEmail(String email) {
				Email = email;
			}


			public Client(String name, String cPF, String phone, String adress, String cEP, String sex,
					String dataNascimento, String email) {
				super(name, cPF, phone, adress, cEP, sex, dataNascimento);
				this.setEmail(email);	
			}
			
			public Client() {
				super();
			}
			
			

			public boolean validarEmail(String email) {
			    boolean isEmailIdValid = false;
			    if (email != null && email.length() > 0) {
			        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			        Matcher matcher = pattern.matcher(email);
			        if (matcher.matches()) {
			            isEmailIdValid = true;
			        }
			        
			    }
			    return isEmailIdValid;

			}
			
			
			
			
			
			public static ArrayList<String> searchClient(String tabela) throws SQLException {
			Connection conn = DataBase.DB.getConnection();
			Statement statement = conn.createStatement();
			ArrayList<String> valores = new ArrayList <String> ();

			ResultSet rs = statement.executeQuery("select *from "+tabela);
			
			while(rs.next()) {				
				valores.add(rs.getString("nameclient"));
					}
			
			return valores;
			
			}

} 