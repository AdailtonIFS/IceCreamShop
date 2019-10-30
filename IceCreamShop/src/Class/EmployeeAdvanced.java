package Class;

public class EmployeeAdvanced extends Employee{
	
	private String LoginADM;
	private String PasswordADM;
	
	public String getLoginADM() {
		return LoginADM;	 
	}

	public void setLoginADM(String loginADM) {
		LoginADM = loginADM;
	}

	public String getPasswordADM() {
		return PasswordADM;
	}

	public void setPasswordADM(String passwordADM) {
		PasswordADM = passwordADM;
	}

	public EmployeeAdvanced() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAdvanced(String name, String cPF, String phone, String adress, String cEP, String sex,
			String dataNascimento, Double salar, String office, String loginADM, String passwordADM) {
		super(name, cPF, phone, adress, cEP, sex, dataNascimento, salar, office);
		this.setLoginADM(loginADM);
		this.setPasswordADM(passwordADM);
	}


	
	
	
	

	
}
