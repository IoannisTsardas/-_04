package SafeCarSenario_Omada_4;

import java.util.ArrayList;

public class Katalogos_eggrafwn {
	private eggrafo Eggrafo;
	private Ypallhlos upallilos;
	private ArrayList<eggrafo> eggrafa = new ArrayList<>();
	
	
	public Katalogos_eggrafwn(eggrafo eggrafo, Ypallhlos _upallilos) {
		super();
		Eggrafo = eggrafo;
		this.upallilos = _upallilos;
	}
	
	public eggrafo getEggrafo() {
		return Eggrafo;
	}
	public void setEggrafo(eggrafo eggrafo) {
		Eggrafo = eggrafo;
	}
	public Ypallhlos get_upallilos() {
		return upallilos;
	}
	public void set_upallilos(Ypallhlos _upallilos) {
		this.upallilos = _upallilos;
	}


}