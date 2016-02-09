package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue
	@Column(name = "Utilisateur_ID")
	private int identifiant;
	private String nom;
	private String prénom;
	private String email;
	private String login;
	private String Password;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "User_Profile", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "USER_PROFILE_ID") })
	private Set<Profile> userProfiles = new HashSet<Profile>();

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	private Magasin magasin;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "destributeur")
	private Collection<Commande> destributeur = new ArrayList<Commande>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "revendeur")
	private Collection<Commande> revendeur = new ArrayList<Commande>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Collection<Affectation> affectation = new ArrayList<Affectation>();

	public Collection<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(Collection<Affectation> affectation) {
		this.affectation = affectation;
	}

	public Collection<Commande> getDestributeur() {
		return destributeur;
	}

	public void setDestributeur(Collection<Commande> destributeur) {
		this.destributeur = destributeur;
	}

	public Collection<Commande> getRevendeur() {
		return revendeur;
	}

	public void setRevendeur(Collection<Commande> revendeur) {
		this.revendeur = revendeur;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public Utilisateur() {

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Set<Profile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Set<Profile> userProfiles) {
		this.userProfiles = userProfiles;
	}

}