package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue
	private int identifiant;
	private String nom;
	private String pr�nom;
	private String email;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "utilisateur")
	private Collection<Compte> m_Compte = new ArrayList<Compte>();

	public Collection<Compte> getM_Compte() {
		return m_Compte;
	}

	public void setM_Compte(Collection<Compte> m_Compte) {
		this.m_Compte = m_Compte;
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

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public Utilisateur() {

	}

	public Utilisateur(String email, String nom, String pr�nom, Compte m_Compte) {
		super();
		this.email = email;
		this.nom = nom;
		this.pr�nom = pr�nom;
	}

}