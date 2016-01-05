package ma.emsi.mvc.data.entities;

public class Camion {


	private String matricule;
	private int capacite;
	private boolean etat;
	private int identifiant;
	private double lattitude;
	private double longetude;
	private String marque;

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
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

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Camion(int capacite, boolean etat, int identifiant, double lattitude, double longetude, String marque,
			String matricule) {
		super();
		this.capacite = capacite;
		this.etat = etat;
		this.identifiant = identifiant;
		this.lattitude = lattitude;
		this.longetude = longetude;
		this.marque = marque;
		this.matricule = matricule;
	}

	public Camion() {
		super();
	}

}
