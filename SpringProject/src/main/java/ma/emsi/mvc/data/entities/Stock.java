package  ma.emsi.mvc.data.entities;


public class Stock {

	private int QuantitéStockCamion;
	private int seuils;
	public Camion m_Camion;
	public Produit m_Produit;

	public Stock(){

	}

	public Stock(int quantitéStockCamion, int seuils, Camion m_Camion, Produit m_Produit) {
		super();
		QuantitéStockCamion = quantitéStockCamion;
		this.seuils = seuils;
		this.m_Camion = m_Camion;
		this.m_Produit = m_Produit;
	}

	public int getQuantitéStockCamion() {
		return QuantitéStockCamion;
	}

	public void setQuantitéStockCamion(int quantitéStockCamion) {
		QuantitéStockCamion = quantitéStockCamion;
	}

	public int getSeuils() {
		return seuils;
	}

	public void setSeuils(int seuils) {
		this.seuils = seuils;
	}

	public Camion getM_Camion() {
		return m_Camion;
	}

	public void setM_Camion(Camion m_Camion) {
		this.m_Camion = m_Camion;
	}

	public Produit getM_Produit() {
		return m_Produit;
	}

	public void setM_Produit(Produit m_Produit) {
		this.m_Produit = m_Produit;
	}

	
}