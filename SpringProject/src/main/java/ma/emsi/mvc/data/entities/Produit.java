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
public class Produit {

	@Id
	@GeneratedValue
	@Column(name = "Produit_ID")
	private int identifiant;
	private String intitule;
	private int quantiteStock;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit", cascade = CascadeType.ALL)
	private Collection<Stock> m_Stock = new ArrayList<Stock>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit", cascade = CascadeType.ALL)
	private Collection<LignComProd> m_Lign = new ArrayList<LignComProd>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Marque_ID", nullable = false)
	private Marque marque;
	
	public Collection<LignComProd> getM_Lign() {
		return m_Lign;
	}

	public void setM_Lign(Collection<LignComProd> m_Lign) {
		this.m_Lign = m_Lign;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Collection<Stock> getM_Stock() {
		return m_Stock;
	}

	public void setM_Stock(Collection<Stock> m_Stock) {
		this.m_Stock = m_Stock;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public Produit(String intitule, int quantiteStock) {
		super();
		this.intitule = intitule;
		this.quantiteStock = quantiteStock;
	}

	public Produit() {
		super();
	}

}
