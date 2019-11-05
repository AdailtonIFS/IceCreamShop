package Class;

public class Employee extends Person {

	
	private Double Salar;//ATRIBUTO SALÁRIO
	private String Office;//ATRIBUTO CARGO
	private String Type;
	private String Login;
	private String Password;
	
	
	public Double getSalar() {
		return Salar;
	}
	public void setSalar(Double salar) {
		Salar = salar;
	}
	public String getOffice() {
		return Office;
	}
	public void setOffice(String office) {
		Office = office;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}

	public String getLogin() {
		return Login;	 
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String cPF, String phone, String adress, String cEP, String sex,
			String dataNascimento, Double salar, String office,String login,String password, String type) {
		super(name, cPF, phone, adress, cEP, sex, dataNascimento);
		this.setSalar(salar);
		this.setOffice(office);
		this.setType(type);
		this.setLogin(login);
		this.setPassword(password);
	}
	
	
	
	
		
}// <------ FIM DO PROGRAMA