package ma.emsi.mvc.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie {

	@Id
	@GeneratedValue
	private int identifiant;
	private String Description;
	private String intitule;

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
