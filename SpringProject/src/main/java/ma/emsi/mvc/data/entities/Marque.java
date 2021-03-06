package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	@Column(name = "Marque_ID")
	private int identifiant;
	private String nomMarque;
	private String reference;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Categorie_ID", nullable = false)
	private Categorie categorie;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "marque")
	private Collection<Produit> produit = new ArrayList<Produit>();

	public Collection<Produit> getProduit() {
		return produit;
	}

	public void setProduit(Collection<Produit> m_Produit) {
		this.produit = m_Produit;
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

	public Marque( String nomMarque, String reference) {
		super();
		this.nomMarque = nomMarque;
		this.reference = reference;
	}

	public Marque() {
		super();
	}

}
