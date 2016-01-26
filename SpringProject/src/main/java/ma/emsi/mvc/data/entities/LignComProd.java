package ma.emsi.mvc.data.entities;

/**
 * @author h
 * @version 1.0
 * @created 30-d�c.-2015 11:34:21
 */
public class LignComProd {

	private int quantit�Com;
	public Commande m_Commande;
	public Produit m_Produit;

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