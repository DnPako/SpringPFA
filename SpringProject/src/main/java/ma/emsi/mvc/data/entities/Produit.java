package ma.emsi.mvc.data.entities;

public class Produit {

	private int identifiant;
	private String intitule;
	private int quantiteStock;

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

	public Produit(int identifiant, String intitule, int quantiteStock) {
		super();
		this.identifiant = identifiant;
		this.intitule = intitule;
		this.quantiteStock = quantiteStock;
	}

	public Produit() {
		super();
	}

}
