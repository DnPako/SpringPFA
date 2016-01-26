package ma.emsi.mvc.data.entities;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
@AssociationOverrides({
	@AssociationOverride(name = "pk.produit", 
		joinColumns = @JoinColumn(name = "identifiant")),
	@AssociationOverride(name = "pk.commande", 
		joinColumns = @JoinColumn(name = "identifiant")) })
public class LignComProd {

	private int quantitéCom;
	public Commande m_Commande;
	public Produit m_Produit;

	public int getQuantitéCom() {
		return quantitéCom;
	}

	public void setQuantitéCom(int quantitéCom) {
		this.quantitéCom = quantitéCom;
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

	public LignComProd(int quantitéCom, Commande m_Commande, Produit m_Produit) {
		super();
		this.quantitéCom = quantitéCom;
		this.m_Commande = m_Commande;
		this.m_Produit = m_Produit;
	}

}