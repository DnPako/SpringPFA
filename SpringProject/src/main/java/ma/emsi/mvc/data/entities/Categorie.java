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
public class Categorie {

	@Id
	@GeneratedValue
	@Column(name = "Categorie_ID")
	private int identifiant;
	private String Description;
	private String intitule;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categorie")
	private Collection<Marque> marque = new ArrayList<Marque>();
	
	

	public Collection<Marque> getMarque() {
		return marque;
	}

	public void setMarque(Collection<Marque> marque) {
		this.marque = marque;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Categorie(String description, String intitule) {
		super();
		Description = description;
		this.intitule = intitule;
	}

	public Categorie() {
		super();
	}

}
