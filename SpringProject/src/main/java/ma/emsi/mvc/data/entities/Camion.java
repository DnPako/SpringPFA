package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Camion {

	@Id
	@GeneratedValue
	@Column(name = "Camion_ID")
	private int identifiant;
	private String matricule;
	private int capacite;
	private boolean etat;
	private double lattitude;
	private double longetude;
	private String marque;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "camion")
	private Collection<Stock> stock = new ArrayList<Stock>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "camion")
	private Collection<Affectation> affectation = new ArrayList<Affectation>();

	public Collection<Stock> getStock() {
		return stock;
	}

	public void setStock(Collection<Stock> stock) {
		this.stock = stock;
	}

	public Collection<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(Collection<Affectation> affectation) {
		this.affectation = affectation;
	}

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

	public Camion(int capacite, boolean etat, double lattitude, double longetude, String marque,
			String matricule) {
		super();
		this.capacite = capacite;
		this.etat = etat;
		this.lattitude = lattitude;
		this.longetude = longetude;
		this.marque = marque;
		this.matricule = matricule;
	}

	public Camion() {
		super();
	}

}
