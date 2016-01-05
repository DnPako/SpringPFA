package ma.emsi.mvc.data.entities;

import java.util.Date;

public class Commande {

	private int identifiant;
	private Date dateCommande;
	private Date dateLivraison;
	private String libelle;
	private boolean validation;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isValidation() {
		return validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public Commande(int identifiant, Date dateCommande, Date dateLivraison, String libelle, boolean validation) {
		super();
		this.identifiant = identifiant;
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.libelle = libelle;
		this.validation = validation;
	}

	public Commande() {
		super();
	}

}
