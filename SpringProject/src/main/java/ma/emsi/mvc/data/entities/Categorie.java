package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue
	private int identifiant;
	private String Description;
	private String intitule;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categorie")
	private Collection<Marque> m_Marque = new ArrayList<Marque>();
	
	public Collection<Marque> getM_Marque() {
		return m_Marque;
	}

	public void setM_Marque(Collection<Marque> m_Marque) {
		this.m_Marque = m_Marque;
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

	public Categorie(int identifiant, String description, String intitule) {
		super();
		this.identifiant = identifiant;
		Description = description;
		this.intitule = intitule;
	}

	public Categorie() {
		super();
	}

}
