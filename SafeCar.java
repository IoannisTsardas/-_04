package SafeCar_Omada_4;

import java.util.ArrayList;

public class SafeCar {

	public static void main(String[] args) {
		
		ArrayList<Customer> CustomersCheck = new ArrayList<>();
		ArrayList<Customer> Customers = new ArrayList<>();
		ArrayList<Vehicle> VehiclesCheck = new ArrayList<>();
		ArrayList<Vehicle> Vehicles = new ArrayList<>();
		ArrayList<InsuranceContract> insContracts = new ArrayList<>();
		
		Customer Customer1 = new Customer("Maria","Papadopoulou","2310264368","maria.papadopoulou@gmail.com","AO79432");
		CustomersCheck.add(Customer1);
		Customer Customer2 = new Customer("Evanthia","Papagiannh","2310245368","evanthia.papagiannh@gmail.com","AO79349");
		CustomersCheck.add(Customer2);
		Customer Customer3 = new Customer("Vasilis","Karagiannhs","2310245668","ioannis.karagiannhs@gmail.com","AO79359");
		CustomersCheck.add(Customer3);
		
		for(Customer customer: CustomersCheck) {
			if(!(Customers.contains(customer.getArithmos_Taftothtas()))) {
				Customers.add(customer);
				System.out.println("New customer has been created! "+ customer.getName()+ " " + customer.getLastName() + " is now member.");
			}
			
		}

		Vehicle Vehicle1 = new Vehicle("Mercedes","GLC", "XKP8923", "2020","7C3FR76A515072256");
		VehiclesCheck.add(Vehicle1);
		Vehicle Vehicle2 = new Vehicle("Subaru", "Forester", "NII4269", "2018","7C3FR76A555071465");
		VehiclesCheck.add(Vehicle2);
		Vehicle Vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", "2022","7C3FR76A55504645");
		VehiclesCheck.add(Vehicle3);
		
		for(Vehicle vehicle: VehiclesCheck) {
			if(!(Vehicles.contains(vehicle.getArithmos_Plaisiou()))) {
				Vehicles.add(vehicle);
				System.out.println("New vehicle has been created!");
			}
				
		}
		
		InsurancePolicy InsurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
		InsurancePolicy InsurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
		InsurancePolicy InsurancePolicy3 = new InsurancePolicy("O58", "Me odiki", "6");
		
		InsuranceContract InsuranceContract1 = new InsuranceContract(Customer1,Vehicle1,InsurancePolicy2,60);
		InsuranceContract InsuranceContract2 = new InsuranceContract(Customer2,Vehicle2,InsurancePolicy1,120);
		InsuranceContract InsuranceContract3 = new InsuranceContract(Customer3,Vehicle3,InsurancePolicy3,80);
		
		insContracts.add(InsuranceContract1);
		insContracts.add(InsuranceContract2);
		insContracts.add(InsuranceContract3);
		
		for(InsuranceContract ins: insContracts) {
			ins.printData();
		}
		
		for(Customer customer: Customers) {
			ArrayList<Vehicle> vehs = new ArrayList<>();
			float sum = 0;
			for(InsuranceContract contract: insContracts) {
				if(customer.getArithmos_Taftothtas().equals(contract.getCustomer().getArithmos_Taftothtas())) {
				   vehs.add(contract.getVehicle());
				   sum = sum + contract.getKostos();
					}
			}
			System.out.print("Onoma pelath:" + customer.getName() + " Sunoliko kostos asfalisthriwn: " + sum);
			for(Vehicle veh: vehs) {
				veh.printData();
			}

			
		}

  }
}
