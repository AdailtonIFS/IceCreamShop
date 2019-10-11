	package IceCream;

public class IceCream {
	
	private String Flavor;
	private double Price;
	private String Description;
	private String Type;
	private String Codigo;
	
	public String getFlavor() {
		return Flavor;
	}
	public void setFlavor(String flavor) {
		Flavor = flavor;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	public IceCream(String flavor, double price, String description, String type, String codigo) {
		super();
		Flavor = flavor;
		Price = price;
		Description = description;
		Type = type;
		Codigo = codigo;
	}

	

}
