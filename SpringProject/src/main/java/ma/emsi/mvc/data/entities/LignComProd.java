package ma.emsi.mvc.data.entities;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LignComProd {

	@Id
	@GeneratedValue
	@Column(name = "LignComProd_ID")
	private int identifiant;
	private int quantit�Com;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Commande_ID", nullable = false)
	public Commande m_Commande;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Produit_ID", nullable = false)
	public Produit m_Produit;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public int getQuantit�Com() {
		return quantit�Com;
	}

	public void setQuantit�Com(int quantit�Com) {
		this.quantit�Com = quantit�Com;
	}

	public Commande getM_Commande() {
		return m_Commande;
	}

	public void setM_Commande(Commande m_Commande) {
		this.m_Commande = m_Commande;
	}

	public Produit getM_Produit() {
		return m_Produit;
	}

	public void setM_Produit(Produit m_Produit) {
		this.m_Produit = m_Produit;
	}

	public LignComProd() {

	}

	public LignComProd(int quantit�Com, Commande m_Commande, Produit m_Produit) {
		super();
		this.quantit�Com = quantit�Com;
		this.m_Commande = m_Commande;
		this.m_Produit = m_Produit;
	}

}