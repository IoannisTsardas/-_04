package SafeCarSenario_Omada_4;

public class Paketo_asfalishs {
	private double kostos;
	private String enarji_asfalishs;
	private String lhksi_asfalishs;
	private Ypallhlos ypallilos_;
	private Pelaths pelatis_;
	private Asfaleia asfaleia_;
	
	public Paketo_asfalishs(double kostos, String enarji_asfalishs, String lhksi_asfalishs, Ypallhlos ypallilos_,
			Pelaths pelatis_, Asfaleia asfaleia_) {
		super();
		this.kostos = kostos;
		this.enarji_asfalishs = enarji_asfalishs;
		this.lhksi_asfalishs = lhksi_asfalishs;
		this.ypallilos_ = ypallilos_;
		this.pelatis_ = pelatis_;
		this.asfaleia_ = asfaleia_;
	}
	public double getKostos() {
		return kostos;
	}
	public void setKostos(double kostos) {
		this.kostos = kostos;
	}
	public String getEnarji_asfalishs() {
		return enarji_asfalishs;
	}
	public void setEnarji_asfalishs(String enarji_asfalishs) {
		this.enarji_asfalishs = enarji_asfalishs;
	}
	public String getLhksi_asfalishs() {
		return lhksi_asfalishs;
	}
	public void setLhksi_asfalishs(String lhksi_asfalishs) {
		this.lhksi_asfalishs = lhksi_asfalishs;
	}
	public Ypallhlos getYpallilos_() {
		return ypallilos_;
	}
	public void setYpallilos_(Ypallhlos ypallilos_) {
		this.ypallilos_ = ypallilos_;
	}
	public Pelaths getPelatis_() {
		return pelatis_;
	}
	public void setPelatis_(Pelaths pelatis_) {
		this.pelatis_ = pelatis_;
	}
	public Asfaleia getAsfaleia_() {
		return asfaleia_;
	}
	public void setAsfaleia_(Asfaleia asfaleia_) {
		this.asfaleia_ = asfaleia_;
	}

	
}
