package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Marque {

	@Id
	@GeneratedValue
	private int identifiant;
	private String nomMarque;
	private String reference;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "identifiant", nullable = false)
	private Categorie categorie;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "marque")
	private Collection<Produit> m_Produit = new ArrayList<Produit>();

	public Collection<Produit> getM_Produit() {
		return m_Produit;
	}

	public void setM_Produit(Collection<Produit> m_Produit) {
		this.m_Produit = m_Produit;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Marque(int identifiant, String nomMarque, String reference) {
		super();
		this.identifiant = identifiant;
		this.nomMarque = nomMarque;
		this.reference = reference;
	}

	public Marque() {
		super();
	}

}
