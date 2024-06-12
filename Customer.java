package SafeCar_Omada_4;

public class Customer {
	
	private String name;
	private String lastName;
	private String phone;
	private String email;
	private String Arithmos_Taftothtas;
	
	
	public Customer(String name, String lastName, String phone, String email, String arithmos_Taftothtas) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		Arithmos_Taftothtas = arithmos_Taftothtas;
	}
	public void printData() {
		System.out.println("Onoma:" +name);
		System.out.println("Epitheto:" +lastName);
		System.out.println("Arithmos thlefwnou:" +phone);
		System.out.println("Email:" +email);
		System.out.println("Arithmos Taftothtas:" +Arithmos_Taftothtas);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getArithmos_Taftothtas() {
		return Arithmos_Taftothtas;
	}
	public void setArithmos_Taftothtas(String arithmos_Taftothtas) {
		Arithmos_Taftothtas = arithmos_Taftothtas;
	}
	
	public boolean contains(String arTaut) {
		if(this.Arithmos_Taftothtas.equals(arTaut))
			return true;
		else
			return false;
	}
	

}
