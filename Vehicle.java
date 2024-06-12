package SafeCar_Omada_4;

public class Vehicle {
	
	private String Marka;
	private String Montelo;
	private String Year;
	private String Pinakida;
	private String Arithmos_Plaisiou;
	
	
	public Vehicle(String marka, String montelo, String year, String pinakida, String arithmos_Plaisiou) {
		super();
		Marka = marka;
		Montelo = montelo;
		Year = year;
		Pinakida = pinakida;
		Arithmos_Plaisiou = arithmos_Plaisiou;
	}
	public void printData() {
		System.out.println(" Marka: " + Marka +
				" Montelo: " + Montelo +
				" Year: " + Year +
				" Pinakida " + Pinakida +
				" Arithmos plaisiou: " + Arithmos_Plaisiou
				);
	}
	
	public String getMarka() {
		return Marka;
	}
	public void setMarka(String marka) {
		Marka = marka;
	}
	public String getMontelo() {
		return Montelo;
	}
	public void setMontelo(String montelo) {
		Montelo = montelo;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getPinakida() {
		return Pinakida;
	}
	public void setPinakida(String pinakida) {
		Pinakida = pinakida;
	}
	public String getArithmos_Plaisiou() {
		return Arithmos_Plaisiou;
	}
	public void setArithmos_Plaisiou(String arithmos_Plaisiou) {
		Arithmos_Plaisiou = arithmos_Plaisiou;
	}
	
	

}
