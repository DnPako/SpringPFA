package  ma.emsi.mvc.data.entities;


public class Stock {

	private int Quantit�StockCamion;
	private int seuils;
	public Camion m_Camion;
	public Produit m_Produit;

	public Stock(){

	}

	public Stock(int quantit�StockCamion, int seuils, Camion m_Camion, Produit m_Produit) {
		super();
		Quantit�StockCamion = quantit�StockCamion;
		this.seuils = seuils;
		this.m_Camion = m_Camion;
		this.m_Produit = m_Produit;
	}

	public int getQuantit�StockCamion() {
		return Quantit�StockCamion;
	}

	public void setQuantit�StockCamion(int quantit�StockCamion) {
		Quantit�StockCamion = quantit�StockCamion;
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