package Employees;

import IceCreamShop.Person;

public class Employee extends Person {

	
	private Double Salar;//ATRIBUTO SALÁRIO
	private String Office;//ATRIBUTO CARGO
	
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String cPF, String phone, String adress, String cEP, String sex,
			String dataNascimento, Double salar, String office) {
		super(name, cPF, phone, adress, cEP, sex, dataNascimento);
		this.setSalar(salar);
		this.setOffice(office);
	}

	
	
	
		
}// <------ FIM DO PROGRAMA