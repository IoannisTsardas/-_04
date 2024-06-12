package SafeCarSenario_Omada_4;

import java.util.ArrayList;

public class Katalogos_pelatwn {
	private Pelaths pelatis;
	private Ypallhlos ypallilos_;
	private ArrayList<Pelaths> pelates = new ArrayList<>();
	
	public Katalogos_pelatwn(Pelaths pelatis, Ypallhlos ypallilos_, ArrayList<Pelaths> pelates) {
		super();
		this.pelatis = pelatis;
		this.ypallilos_ = ypallilos_;
		this.pelates = pelates;
	}
	public Pelaths getPelatis() {
		return pelatis;
	}
	public void setPelatis(Pelaths pelatis) {
		this.pelatis = pelatis;
	}
	public Ypallhlos getYpallilos_() {
		return ypallilos_;
	}
	public void setYpallilos_(Ypallhlos ypallilos_) {
		this.ypallilos_ = ypallilos_;
	}
	public ArrayList<Pelaths> getPelates() {
		return pelates;
	}
	public void setPelates(ArrayList<Pelaths> pelates) {
		this.pelates = pelates;
	}

	
}