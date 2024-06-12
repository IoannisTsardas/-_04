package SafeCar_Omada_4;

public class InsuranceContract {
	
	private Customer customer;
    private Vehicle vehicle;
    private InsurancePolicy insurancePolicy;
    private float kostos;
    
    
	public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy insurance_policy, int kostos) {
		super();
		this.customer = customer;
		this.vehicle = vehicle;
		this.insurancePolicy = insurance_policy;
		this.kostos = kostos;
	}
	
	public void printData() {
	   System.out.println("Onoma pelath:" + customer.getName()+ " " + customer.getLastName()+
			   " Arithmos pinakidas:" + vehicle.getPinakida() +
			   " Perigrafh asfalisthriou:" + insurancePolicy.getPerigrafi() +
			   " Kostos asfalisthriou:" + kostos);		
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public InsurancePolicy getInsurance_policy() {
		return insurancePolicy;
	}
	public void setInsurance_policy(InsurancePolicy insurance_policy) {
		this.insurancePolicy = insurance_policy;
	}
	public float getKostos() {
		return kostos;
	}
	public void setKostos(int kostos) {
		this.kostos = kostos;
	}
    

}
