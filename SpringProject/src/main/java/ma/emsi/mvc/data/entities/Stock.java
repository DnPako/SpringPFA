package  ma.emsi.mvc.data.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stock {

	@Id
	@GeneratedValue
	@Column(name = "Stock_ID")
	private int identifiant;
	private int QuantitéStockCamion;
	private int seuils;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Camion_ID", nullable = false)
	public Camion camion;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Produit_ID", nullable = false)
	public Produit produit;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
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

	public Camion getCamion() {
		return camion;
	}

	public void setCamion(Camion camion) {
		this.camion = camion;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	
	
}