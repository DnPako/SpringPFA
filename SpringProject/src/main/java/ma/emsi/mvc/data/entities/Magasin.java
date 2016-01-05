package ma.emsi.mvc.data.entities;

public class Magasin {

	private int identifiant;
	private String adresse;
	private double lattitude;
	private double longetude;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongetude() {
		return longetude;
	}

	public void setLongetude(double longetude) {
		this.longetude = longetude;
	}

	public Magasin(int identifiant, String adresse, double lattitude, double longetude) {
		super();
		this.identifiant = identifiant;
		this.adresse = adresse;
		this.lattitude = lattitude;
		this.longetude = longetude;
	}

	public Magasin() {
		super();
	}

}
