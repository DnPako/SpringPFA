package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

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
public class Commande {

	@Id
	@GeneratedValue
	@Column(name = "Commande_ID")
	private int identifiant;
	private Date dateCommande;
	private Date dateLivraison;
	private String libelle;
	private boolean validation;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "revend", referencedColumnName = "Utilisateur_ID", nullable = false)
	private Utilisateur revendeur;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "distri", referencedColumnName = "Utilisateur_ID", nullable = false)
	private Utilisateur destributeur;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "commande")
	private Collection<LignComProd> lign = new ArrayList<LignComProd>();

	public Utilisateur getRevendeur() {
		return revendeur;
	}

	public void setRevendeur(Utilisateur revendeur) {
		this.revendeur = revendeur;
	}

	public Utilisateur getDestributeur() {
		return destributeur;
	}

	public void setDestributeur(Utilisateur destributeur) {
		this.destributeur = destributeur;
	}

	public Collection<LignComProd> getLign() {
		return lign;
	}

	public void setLign(Collection<LignComProd> lign) {
		this.lign = lign;
	}

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

	public Commande(Date dateCommande, Date dateLivraison, String libelle, boolean validation) {
		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.libelle = libelle;
		this.validation = validation;
	}

	public Commande() {
		super();
	}

}
